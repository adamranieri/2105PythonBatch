from daos.book_dao import BookDAO
from entities.book import Book
from exceptions.not_found_exception import ResourceNotFoundError
from services.book_service import BookService


class BookServiceImpl(BookService):

    # Compisition
    def __init__(self, book_dao: BookDAO):
        self.book_dao = book_dao
        # Dependency injection
        # The service needs a BOOK DAO to perform crud operations
        # When creating a service we will INJECT a BookDAO into it
        # Deoupling. Makes our code more modular and independent
        # Easier to test and easier to refactor

    def add_book(self, book: Book):
        return self.book_dao.create_book(book)

    def retrieve_all_books(self):
        return self.book_dao.get_all_books()

    def retrieve_book_by_id(self, book_id: int):
        return self.book_dao.get_book_by_id(book_id)

    def update_book(self, book: Book):
        return self.book_dao.update_book(book)

    def remove_book(self, book_id: int):
        result = self.book_dao.delete_book(book_id)
        if result:
            return result
        else:
            raise ResourceNotFoundError(f"book with the id of {book_id} could not be found")