package dev.ranieri.controllers;


import com.google.gson.Gson;
import dev.ranieri.entities.Book;
import dev.ranieri.exceptions.ResourceNotFound;
import dev.ranieri.services.BookService;
import io.javalin.http.Handler;

import java.util.List;

// Controllers are classes that are responsible for handling incomeint Http Requests and generating HTTP responses
// They hold your Handler methods
public class BookController {

    private BookService bookService;

    public BookController(BookService bookService){
        this.bookService = bookService;
    }

    // A handler is a lambda that takes in one parameter ctx (context) it is a context object
    // Javalin context object contains all the information about the incoming request
    // all methods responsible for generating a response
    public Handler getAllBooks = ctx -> {
        String title = ctx.queryParam("titlecontains");
        List<Book> books;
        if(title != null){
            books = this.bookService.getBooksByTitle(title);
        }else{
            books = this.bookService.retrieveAllBooks();
        }
        Gson gson = new Gson();
        String booksJSON = gson.toJson(books);
        ctx.result(booksJSON);// send back our string
        ctx.status(200); // send back a status code
        ctx.contentType("application/json");
    };

    public Handler getBookById = ctx -> {
        try{
            int id = Integer.parseInt(ctx.pathParam("id"));
            Book book = this.bookService.retrieveBookById(id);
            Gson gson = new Gson();
            String bookJSON = gson.toJson(book);
            ctx.result(bookJSON);
            ctx.status(200); // does default to 200

        }catch (ResourceNotFound resourceNotFound){
            ctx.result(resourceNotFound.getMessage());
            ctx.status(404);
        }


    };

    public Handler createBook = ctx -> {
        Gson gson = new Gson();
        Book book = gson.fromJson(ctx.body(),Book.class);// 2nd argument is telling gson what class in Java to create
        book = this.bookService.registerBook(book);
        String bookJSON = gson.toJson(book);
        ctx.result(bookJSON);// not uncommon to return the created entity
        ctx.status(201);
    };

}
