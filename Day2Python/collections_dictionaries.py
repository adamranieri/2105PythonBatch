# Dictionaries

# Data structurs that store things as key value pairs
# Key : value
# Dictionaries DO NOT ALLOW duplicate keys
# You can add or remove KV pairs from a dictionary or edit the values inside of it

def welcome():
    print("Welcome")

emails = {
    "Adam":{"phone number": "555-555-5555", "email":"adam.ranieri@revature.com"}, 
    "Richard":"leetsnipz@hotmail.com",
    "Sierra": "hikerwoman96@gmail.com",
    "func": welcome,
    "Nichols": "hikerwoman96@gmail.com",
    965: "Hello World", # you can have ,
    None: 1000
    }

emails["func"]()