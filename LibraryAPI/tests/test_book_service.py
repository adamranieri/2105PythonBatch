

# mocking is a very common testing practice
# faking the output of a function with predefined values
# allows us to write test in a consistent fashion without worrying if an underlying works correctly
from unittest.mock import MagicMock

from daos.book_dao_postgres import BookDaoPostgres
from entities.book import Book
from services.book_service import BookService

# imgaine these are the only three books in my database
from services.book_service_impl import BookServiceImpl

books = [Book(0,'The Lion the Witch and the Wardrobe','doesnt matter',True,0,0),
         Book(0,'War and Peace','doesnt matter',True,0,0),
         Book(0,'Frankenstein','doesnt matter',True,0,0)]

# the book service cannot work unless the BookDAO also works correclty
mock_dao = BookDaoPostgres()
mock_dao.get_all_books = MagicMock(return_value = books)
books = mock_dao.get_all_books() # if you call this function that I magic mocked at line 21 return those defined 3 books

book_service: BookService = BookServiceImpl(mock_dao)

def test_get_by_title_1():
    result = book_service.find_books_by_tile_containing("War")
    assert len(result) == 2

