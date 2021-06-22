package dev.ranieri.entities;

// Entities are a 1 to 1 with tables in your database
// Use java naming conventions for classes and variables/methods camelCase
// entities SHOULD be Beans with private fields and public getters and setters. Java very big on encapsulation
// you can ensure fields are never set to a value you do not want
public class Book {

    private int bookId;
    private String title;
    private String author;
    private boolean isAvailable;
    private int quality;
    private long returnDate;

    // beans require a no args constructor
    public Book() {
    }

    public Book(int bookId, String title, String author, boolean isAvailable, int quality, long returnDate) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
        this.quality = quality;
        this.returnDate = returnDate;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public long getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(long returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isAvailable=" + isAvailable +
                ", quality=" + quality +
                ", returnDate=" + returnDate +
                '}';
    }
}
