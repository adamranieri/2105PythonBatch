package dev.ranieri.services;

import dev.ranieri.entities.Book;
import dev.ranieri.exceptions.ResourceNotFound;

import java.util.List;

public interface BookService {

    Book registerBook(Book book);

    List<Book> retrieveAllBooks();

    Book retrieveBookById(int id);

    List<Book> getBooksByTitle(String title);

    Book updateBook(Book book);

    boolean decommissionBookById(int id);

    Book checkinById(int id);

    Book checkoutById(int id);

}
