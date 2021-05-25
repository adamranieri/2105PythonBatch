# Entity classes are used for storing information
# they will have minimal logic. usually do not have a lot of methods in them

class Book:

    def __init__(self, book_id : int, title: str, author: str, available: bool, quaility: int, return_date: int ):
        self.book_id = book_id # ID should different for every book in our library
        # the book_id will become primary key
        self.title = title
        self.author = author
        self.available = available
        self.quality = quaility
        self.return_date = return_date

    def __str__(self):
        return f"id={self.book_id}, title={self.title}, author={self.author}"

    def as_json_dict(self):
        return {
            "bookId":self.book_id,
            "title":self.title,
            "author":self.author,
            "available":self.available,
            "quality":self.quality,
            "returnDate":self.return_date
        }

