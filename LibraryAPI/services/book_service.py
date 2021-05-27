from abc import ABC, abstractmethod
from typing import List

from entities.book import Book


class BookService(ABC):

    # general CRUD functionality
    @abstractmethod
    def add_book(self, book: Book):
        pass

    @abstractmethod
    def retrieve_all_books(self):
        pass

    @abstractmethod
    def retrieve_book_by_id(self, book_id: int):
        pass

    @abstractmethod
    def update_book(self, book: Book):
        pass

    @abstractmethod
    def remove_book(self, book_id: int):
        pass

    @abstractmethod
    def find_books_by_tile_containing(self, phrase: str) -> List[Book]:
        pass

    @abstractmethod
    def checkout_book(self, book_id: int) -> bool:
        pass
