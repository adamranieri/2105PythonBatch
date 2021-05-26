from typing import List
from daos.book_dao import BookDAO
from entities.book import Book
from utils.connection_util import connection


class BookDaoPostgres(BookDAO):

    def create_book(self, book: Book) -> Book:
        # returning book_id it will return the value of the newly generated key in the database
        sql = """insert into book (title,author,available,quality,return_date) values (%s,%s,%s,%s,%s) returning book_id"""
        cursor = connection.cursor()
        cursor.execute(sql, (book.title, book.author, book.available, book.quality, book.return_date))
        connection.commit()  # make permaent the SQL statements that were executed
        b_id = cursor.fetchone()[0]
        book.book_id = b_id
        return book

    def get_book_by_id(self, book_id: int) -> Book:
        sql = """select * from book where book_id = %s"""
        cursor = connection.cursor()
        cursor.execute(sql, [book_id])
        record = cursor.fetchone()
        # book = Book(record[0],record[1],record[2],record[3],record[4],record[5])
        book = Book(*record)
        return book

    def get_all_books(self) -> List[Book]:
        sql = """select * from book"""
        cursor = connection.cursor()
        cursor.execute(sql)
        records = cursor.fetchall()
        # books = [Book(*record) for record in records]
        book_list = []
        for record in records:
            book_list.append(Book(*record))

        return book_list

    def update_book(self, book: Book) -> Book:
        sql = """update book set title=%s, author=%s, available=%s, quality=%s ,return_date=%s where book_id =%s"""
        cursor = connection.cursor()
        cursor.execute(sql, [book.title, book.author, book.available, book.quality, book.return_date, book.book_id])
        connection.commit()
        return book

    def delete_book(self, book_id: int) -> bool:
        sql = """delete from book where book_id =%s"""
        cursor = connection.cursor()
        cursor.execute(sql, [book_id])
        connection.commit()
        return True
