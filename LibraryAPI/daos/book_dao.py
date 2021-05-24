from abc import ABC, abstractmethod
from typing import List

from entities.book import Book


class BookDAO(ABC):

    # CRUD
    # CREATE
    # create method SAVES a new book to a database or some other location
    @abstractmethod
    def create_book(self, book: Book) -> Book:
        pass

    # READ
    @abstractmethod
    def get_book_by_id(self, book_id: int) -> Book:
        pass

    @abstractmethod # List[Book] is the type annotation for saying a list of books
    def get_all_books(self) -> List[Book]:
        pass

    #UPDATE
    @abstractmethod
    def update_book(self, book: Book) -> Book:
        pass

    #DELETE
    @abstractmethod
    def delete_book(self, book_id: int) -> bool:
        pass