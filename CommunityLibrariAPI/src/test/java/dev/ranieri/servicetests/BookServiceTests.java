package dev.ranieri.servicetests;

import dev.ranieri.daos.BookDAO;
import dev.ranieri.entities.Book;
import dev.ranieri.services.BookService;
import dev.ranieri.services.BookServiceImpl;
import org.mockito.Mockito;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;

public class BookServiceTests {

    BookDAO bookDAO = Mockito.mock(BookDAO.class); // create a mock instance
    BookService bookService = new BookServiceImpl(bookDAO);

    @BeforeMethod // before each test reset anything on our mock object
    void init() {
        List<Book> testBooks = new ArrayList<>();
        Book book1 = new Book(0,"A stitch in time","",true,1,0);
        Book book2 = new Book(0,"Z is for zebra","",true,1,0);
        Book book3 = new Book(0,"Crime and Punishment","",true,1,0);
        testBooks.add(book1);
        testBooks.add(book2);
        testBooks.add(book3);
        Mockito.when(this.bookDAO.getAllBooks()).thenReturn(testBooks);
    }

    @Test
    void find_by_title(){
        List<Book> books = this.bookService.getBooksByTitle("zebra");
        Assert.assertEquals(books.size(),1);
        Assert.assertEquals(books.get(0).getTitle(),"Z is for zebra");
    }


}
