package dev.ranieri.services;

import dev.ranieri.daos.BookDAO;
import dev.ranieri.entities.Book;
import dev.ranieri.exceptions.ResourceNotFound;

import java.util.ArrayList;
import java.util.List;

public class BookServiceImpl implements BookService {

    private BookDAO bookDAO = null; // dependencies are usually private

    public BookServiceImpl(BookDAO bookDAO){
        this.bookDAO = bookDAO; // dependency injection
    }

    @Override
    public Book registerBook(Book book) {
        return this.bookDAO.createBook(book);
    }

    @Override
    public List<Book> retrieveAllBooks() {
        return this.bookDAO.getAllBooks();
    }

    @Override
    public Book retrieveBookById(int id) throws ResourceNotFound {
        return this.bookDAO.getBookById(id);
    }

    @Override
    public List<Book> getBooksByTitle(String title) {
        List<Book> books = this.bookDAO.getAllBooks();
        List<Book> filteredBooks = new ArrayList<>();

        for(Book b : books){
            if(b.getTitle().contains(title)){
                filteredBooks.add(b);
            }
        }

        return filteredBooks;
    }

    @Override
    public Book updateBook(Book book) {
        return this.bookDAO.updateBook(book);
    }

    @Override
    public boolean decommissionBookById(int id) {
        return this.bookDAO.deleteBookById(id);
    }

    @Override
    public Book checkinById(int id) throws ResourceNotFound {
        Book book = this.bookDAO.getBookById(id);
        book.setAvailable(true);;
        book.setReturnDate(0);
        this.bookDAO.updateBook(book);
        return book;
    }

    @Override
    public Book checkoutById(int id) throws ResourceNotFound {
        Book book = this.bookDAO.getBookById(id);
        book.setAvailable(false);
        book.setReturnDate(System.currentTimeMillis() + 1_209_600);
        this.bookDAO.updateBook(book);
        return book;
    }
}
