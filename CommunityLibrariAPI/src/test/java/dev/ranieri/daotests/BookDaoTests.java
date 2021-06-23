package dev.ranieri.daotests;

import dev.ranieri.daos.BookDAO;
import dev.ranieri.daos.BookDaoLocal;
import dev.ranieri.daos.BookDaoPostgres;
import dev.ranieri.entities.Book;
import org.testng.annotations.Test;
import org.testng.Assert;

import java.util.List;

public class BookDaoTests {

    // Test to the interface
    static BookDAO bookDAO = new BookDaoPostgres();
    static Book testBook = new Book(0,"Dracula", "Bram Stoker", true, 1, 0);

    @Test(priority = 1)
    void createBook(){
        Book book = bookDAO.createBook(testBook);
        // Java DOES have an assert method
        // assert  book.getBookId() != 0; using assert is just not that common in Java
        // more common and generally better practice to use an assert method
        Assert.assertNotEquals(book.getBookId(),0);
    }

    @Test(priority = 2) // test names are one of the only exceptions to use snake case in Java
    void get_book_id(){
        Book book = bookDAO.getBookById(testBook.getBookId());
        Assert.assertEquals(book.getTitle(), "Dracula");
    }

    @Test(priority = 3)
    void updateBook(){
        testBook.setAvailable(false);
        bookDAO.updateBook(testBook);
        Book book = bookDAO.getBookById(testBook.getBookId());
        Assert.assertFalse(book.isAvailable());
    }

    @Test(priority = 4)
    void deleteBook(){
        boolean result = bookDAO.deleteBookById(testBook.getBookId());
        Assert.assertTrue(result);
    }

    @Test(priority = 5, dependsOnMethods = "createBook" ) // integration test because it requires create book is successful
    // depends on can be used to only run this method if another test passes
    void allBooks(){
        Book book1 =new Book(0,"Frankenstein", "Mary Shelley", true,1,0);
        Book book2 =new Book(0,"Frankenstein 2", "Mary Shelley", true,1,0);
        Book book3 =new Book(0,"Frankenstein 3", "Mary Shelley", true,1,0);
        bookDAO.createBook(book1);
        bookDAO.createBook(book2);
        bookDAO.createBook(book3);
        List<Book> books = bookDAO.getAllBooks();
        Assert.assertTrue(books.size()>=3);

        bookDAO.deleteBookById(book1.getBookId());
        bookDAO.deleteBookById(book2.getBookId());
        bookDAO.deleteBookById(book3.getBookId());

    }




}
