from daos.book_dao import BookDAO
from daos.book_dao_local import BookDaoLocal
from daos.book_dao_postgres import BookDaoPostgres
from entities.book import Book

book_dao: BookDAO = BookDaoPostgres()
# An entity that HAS NOT BEEN SAVED should have an ID of 0
# this is a well established convention in every tech stack
# Many application store date information as the unix epoch
# seconds from Jan 1st midnight 1970
test_book = Book(0,"Fellowship of the Ring", "Tolkien",True, 2, 0)

#PyTest runs tests in order top to bottom

def test_create_book():
    book_dao.create_book(test_book) # create_book should save the object
    assert test_book.book_id != 0 # the book should no longer have 0 as an id

def test_get_book_by_id():
    book = book_dao.get_book_by_id(test_book.book_id)
    assert test_book.title == book.title # assert that the book object we got from the DAO has same title

def test_update_book():
    test_book.available = False
    updated_book = book_dao.update_book(test_book)
    assert updated_book.available == test_book.available

def test_delete_book():
    result = book_dao.delete_book(test_book.book_id)
    assert result

# Integrated test. Requires that other methods work in order for it to pass
def test_get_all_books():
    book1 = Book(0,"1984","George Orwell",True,1,0)
    book2 = Book(0, "1985", "George Orwell", True, 1, 0)
    book3 = Book(0, "1985: Reloaded", "George Orwell", True, 1, 0)
    book_dao.create_book(book1)
    book_dao.create_book(book2)
    book_dao.create_book(book3)
    books = book_dao.get_all_books()
    assert len(books) >= 3
