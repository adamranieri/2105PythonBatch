from flask import Flask, request, jsonify
from daos.book_dao_local import BookDaoLocal
from entities.book import Book
from services.book_service_impl import BookServiceImpl

app: Flask = Flask(__name__)

# Handler methods create your WEB API layer
# They are responsible for handling HTTP request and giving back responses
# Parsing and generating JSONs, giving back status codes as appropriate
# They SHOULD NOT be directly responsible for CRUD operations or Bussiness Logic
# Your Handler should use services. THEY SHOULD NOT uses DAOs directly
book_dao = BookDaoLocal()
book_service = BookServiceImpl(book_dao) # Dependency Injection

@app.route("/books", methods = ["POST"])
def create_book():
    body = request.json # json will return a python dictionary version of that JSON
    book = Book(body["bookId"], body["title"], body["author"], body["available"], body["quality"], body["returnDate"])
    book_service.add_book(book) # pass off the heavier logic to the service
    return f"Created book with id{book.book_id}", 201 # 201 is the status code for creating a new resource

@app.route("/books/<book_id>", methods = ["GET"])
def get_book_by_id(book_id: str):
    book = book_service.retrieve_book_by_id(int(book_id))
    return jsonify(book.as_json_dict())

@app.route("/books", methods =["GET"])
def get_all_books():
    books = book_service.retrieve_all_books() # list of books
    json_books = [b.as_json_dict() for b in books] # list json dict
    #
    # json_books = []
    # for b in books:
    #     json_books.append(b.as_json_dict())
    return jsonify(json_books)

@app.route("/books/<book_id>", methods=["PUT"])
def update_book(book_id: str):
    body = request.json  # json will return a python dictionary version of that JSON
    book = Book(body["bookId"], body["title"], body["author"], body["available"], body["quality"], body["returnDate"])
    # the body might contain a valid ID of a book to update
    # The ID specified in the URI at the top overrides anything in the body
    book.book_id = int(book_id)
    book_service.update_book(book)
    return "updated successfully"

@app.route("/books/<book_id>", methods = ["DELETE"])
def delete_book(book_id: str):
    book_service.remove_book(int(book_id))
    return "Deleted successfully", 200

if __name__ == '__main__':
    app.run()

