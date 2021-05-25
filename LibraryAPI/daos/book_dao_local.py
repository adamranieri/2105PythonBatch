from typing import List
from daos.book_dao import BookDAO
from entities.book import Book


# BookDAO that saves objects in local memory
from exceptions.not_found_exception import ResourceNotFoundError


class BookDaoLocal(BookDAO):
    id_maker = 0  # mimic a primary key generator in a database
    book_table = {}  # mimicing a table in a database

    def create_book(self, book: Book) -> Book:
        BookDaoLocal.id_maker += 1
        book.book_id = BookDaoLocal.id_maker
        # adding a new item to a dictionary
        BookDaoLocal.book_table[BookDaoLocal.id_maker] = book
        return book

    def get_book_by_id(self, book_id: int) -> Book:
        try:
            book = BookDaoLocal.book_table[book_id]
            return book
        except KeyError:
            raise ResourceNotFoundError(f"Could not find book of id {book_id}")

    def get_all_books(self) -> List[Book]:
        book_list = list(BookDaoLocal.book_table.values())
        return book_list

    def update_book(self, book: Book) -> Book:
        BookDaoLocal.book_table[book.book_id] = book
        return book

    def delete_book(self, book_id: int) -> bool:
        try:
            del BookDaoLocal.book_table[book_id]
            return True
        except KeyError:
            return False
