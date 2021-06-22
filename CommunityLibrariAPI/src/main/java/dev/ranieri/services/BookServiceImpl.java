package dev.ranieri.services;

import dev.ranieri.daos.BookDAO;
import dev.ranieri.entities.Book;

import java.util.ArrayList;
import java.util.List;

public class BookServiceImpl implements BookService {

    private BookDAO bookDAO = null; // dependencies are usually private

    public BookServiceImpl(BookDAO bookDAO){
        this.bookDAO = bookDAO; // dependency injection
    }

    @Override
    public Book registerBook(Book book) {
        return null;
    }

    @Override
    public List<Book> retrieveAllBooks() {
        return null;
    }

    @Override
    public Book retrieveBookById(int id) {
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
        return null;
    }

    @Override
    public boolean decommissionBookById(int id) {
        return false;
    }

    @Override
    public Book checkinById(int id) {
        return null;
    }

    @Override
    public Book checkoutById(int id) {
        return null;
    }
}
