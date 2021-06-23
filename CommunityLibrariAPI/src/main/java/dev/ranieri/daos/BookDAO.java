package dev.ranieri.daos;

import dev.ranieri.entities.Book;
import dev.ranieri.exceptions.ResourceNotFound;

import java.util.List;

// Proper Interface for our DAO
public interface BookDAO {

    //CREATE
    Book createBook(Book book);

    //READ
    Book getBookById(int id);
    List<Book> getAllBooks(); // You should ALWAYS be using the interfaces

    //UPDATE
    Book updateBook(Book book);

    //DELETE
    boolean deleteBookById(int id);

}
