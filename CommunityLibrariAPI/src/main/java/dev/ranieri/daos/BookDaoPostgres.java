package dev.ranieri.daos;

import dev.ranieri.entities.Book;
import dev.ranieri.exceptions.ResourceNotFound;
import dev.ranieri.utils.ConnectionUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookDaoPostgres implements BookDAO{

    @Override
    public Book createBook(Book book) {
        // try with resources syntax
        // you do not have to explicity close the connection. It will always close it and control
        try(Connection connection = ConnectionUtil.createConnection()){
            String sql = "insert into book (title,author,available,quality,return_date) values (?,?,?,?,?)";
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);// for creates where
            // you want the returned value of the auto generated key
            ps.setString(1,book.getTitle());
            ps.setString(2,book.getAuthor());
            ps.setBoolean(3,book.isAvailable());
            ps.setInt(4,book.getQuality());
            ps.setLong(5,book.getReturnDate());

            ps.execute();// actually executes your SQL statement

            ResultSet rs = ps.getGeneratedKeys();
            rs.next();// ResultSet is a cursor that points to the records returned.It intally points to nothing
            // you have .next() to get it to point to the first record
            int key = rs.getInt("book_id");
            book.setBookId(key);
            return book;

        } catch (SQLException sqlException) {
            // SQL exceptions are checked exceptions. You are required to catch the if they go run
            sqlException.printStackTrace();
            return null;
        }
    }

    @Override
    public Book getBookById(int id) { // adding throws to the method signature
        // requires that your inteface be updated
        try(Connection connection = ConnectionUtil.createConnection()) {
            String sql = "select * from book where book_id = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1,id);

            ResultSet rs = ps.executeQuery();
            rs.next();


            Book book = new Book();
            book.setBookId(rs.getInt("book_id"));
            book.setTitle(rs.getString("title"));
            book.setAuthor(rs.getString("author"));
            book.setQuality(rs.getInt("quality"));
            book.setAvailable(rs.getBoolean("available"));
            book.setReturnDate(rs.getLong("return_date"));

            return book;

        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
            throw new ResourceNotFound("The resource with the id of " + id +" could not be found" );
        }

    }

    @Override
    public List<Book> getAllBooks() {
        try(Connection connection = ConnectionUtil.createConnection()) {
            String sql = "select * from book";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            List<Book> books = new ArrayList<>();

            while(rs.next()){
                Book book = new Book();
                book.setBookId(rs.getInt("book_id"));
                book.setTitle(rs.getString("title"));
                book.setAuthor(rs.getString("author"));
                book.setQuality(rs.getInt("quality"));
                book.setAvailable(rs.getBoolean("available"));
                book.setReturnDate(rs.getLong("return_date"));
                books.add(book);
            }

            return books;

        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
            return null;
        }
    }

    @Override
    public Book updateBook(Book book) {
        try(Connection connection = ConnectionUtil.createConnection()){
            String sql = "update book set title=?, author=?, available=?, quality=?, return_date=? where book_id =?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1,book.getTitle());
            ps.setString(2,book.getAuthor());
            ps.setBoolean(3,book.isAvailable());
            ps.setInt(4,book.getQuality());
            ps.setLong(5,book.getReturnDate());
            ps.setInt(6,book.getBookId());

            ps.executeUpdate();// throws an exception if it cannot execute
            return book;

        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
            return null;
        }

    }

    @Override
    public boolean deleteBookById(int id) {
        try(Connection connection = ConnectionUtil.createConnection()){
            String sql = "delete from book where book_id = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1,id);
            ps.execute();
            return true;

        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
            return false;
        }

    }
}
