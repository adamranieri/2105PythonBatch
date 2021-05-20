from flask import Flask, request

app:Flask = Flask(__name__)

# @ is called a decorator in Python. It is actually a  type of enclosed function
# defines a route ("URI", methods = ["http request verbs you are listening for"])
# routes are also called endpoints

@app.route("/hello/<name>", methods = ["GET"])
def hello_world(name: str):
    return "Hello " + name

@app.route("/hola", methods = ["GET"])
def hola_mundo():
    return "Hola Mundo"
# none of these functions are called immediately
# Flask will call that function when it a request of that verb to that uri

@app.route("/calculate/<num1>/add/<num2>", methods = ["GET"])
def add(num1: str, num2: str ):
    sum = int(num1) + int(num2)
    return str(sum)
# Get requests CANNOT have a body


@app.route("/iseven", methods = ["POST"]) # POST requests CAN have a body
def is_even():
    body = request.get_json() # flask will auto convert jsons into Python dictionaries
    # it does this just as a helpful utility
    num = body["number"]
    if num % 2 == 0:
        return  "It is even"
    else:
        return "odd"

@app.route("/calcarea", methods = ["POST"])
def calculate_area():
    body = request.json
    x = body["side1"]
    y = body["side2"]
    area = x * y
    return "the area of the rectangle is" + str(area)



app.run()
