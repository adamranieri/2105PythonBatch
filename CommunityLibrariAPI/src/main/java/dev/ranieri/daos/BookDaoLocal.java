package dev.ranieri.daos;

import dev.ranieri.entities.Book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// This type of class is sometimes called a stub
// A stub is an implemented class that you use for testing or developing another piece of code (often removed
// once a real implementation comes along)
// similar to mocking except a mock HAS NO underlying logic
public class BookDaoLocal implements BookDAO{

    private static Map<Integer,Book> bookTable = new HashMap<>();
    private static int idMaker = 0;

    @Override
    public Book createBook(Book book) {
        int key = ++BookDaoLocal.idMaker;
        book.setBookId(key);
        BookDaoLocal.bookTable.put(key,book);
        return book;
    }

    @Override
    public Book getBookById(int id) {
        return BookDaoLocal.bookTable.get(id); // autoboxing
    }

    @Override
    public List<Book> getAllBooks() {
        List<Book> books = new ArrayList<>(BookDaoLocal.bookTable.values());
        return books;
    }

    @Override
    public Book updateBook(Book book) {
        BookDaoLocal.bookTable.put(book.getBookId(),book);
        return book;
    }

    @Override
    public boolean deleteBookById(int id) {
        Book book = BookDaoLocal.bookTable.remove(id);
        if(book == null){
            return false;
        }else{
            return true;
        }

    }
}
