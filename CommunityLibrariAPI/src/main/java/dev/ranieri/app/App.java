package dev.ranieri.app;

import dev.ranieri.controllers.BookController;
import dev.ranieri.daos.BookDAO;
import dev.ranieri.daos.BookDaoLocal;
import dev.ranieri.services.BookService;
import dev.ranieri.services.BookServiceImpl;
import io.javalin.Javalin;

public class App {

    public static void main(String[] args) {
        Javalin app = Javalin.create();

        BookDAO bookDAO = new BookDaoLocal();
        BookService bookService = new BookServiceImpl(bookDAO);
        BookController bookController = new BookController(bookService);

        // get /books
        app.get("/books", bookController.getAllBooks); // The handler is the function to be executed when a get request is sent to that URI
        // you are passing in the funciton DEFINITION not invoking the function

        // get /books/5
        app.get("/books/:id", bookController.getBookById);

        // post /books
        app.post("/books",bookController.createBook);

        // put /books/15
        //app.put("/books/:id",null);

        // delete /books/4
        //app.delete("/books/:id",null);

        // patch checkin/19
        //app.patch("/checkin/:id", null);

        // patch checkout/20
        //app.patch("/checkout/:id",null);

        app.start(); // defaults to port 7000
    }
}
