# Python is a dyanmic language that does NOT support function overloading
# this is a problem for develpers because renaming essentially the same function for all the types of 
# parameters would be a mess
def say_hello():
    print("Hello Person")

def say_hello(name: str): # this line will REPLACE the function defined on line 3
    print(f"Hello {name}")

# default arguments
def hola(name: str = None):
    if name is None:
        print("Hola random person")
    else:
        print(f"Hola {name}")

hola()
hola("Adam")

def greet_many(*names): # var args essentially a tuple
    for n in names:
        print("Hello" + n)

# greet_many("Adam","Bill","Steve","Joseph")

def super_greet(**kwargs): # Key Word arguments essentially made your argumenst a dictionary
    print(kwargs["adam"])

super_greet(adam="Adam Ranieri", richard = "Richard Orr", sierra = "Sierra Nichols")

# kwargs are really popular for configuration function
# creating a conneciton to a database

def connect_to_datbase(**kwargs):
    username = kwargs["username"]
    password = kwargs["password"]
    print(username)
    print(password)

connect_to_datbase(username="adamgator",password="123pass")

credentials = {"username":"adamgator","password":"123pass"}
connect_to_datbase(**credentials)