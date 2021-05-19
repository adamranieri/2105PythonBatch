# We have been tasked with writing a short console applicaiton
# to see if a person's username is valid
# username has to be at least 6 character long
# it must contain at least one number

# one is that the construtor is already set up take take in message and disply the message when printed
# second you cannot raise an object that is not an excpetion
class InvalidUsernameError(Exception): 

    error_description = "This error occurs when a username has improper values"
    
    def __init__(self, *args: object) -> None:
        super().__init__(*args)
    
    # def __str__(self) -> str:
    #     return "You done goofed"



def validate_username(username: str):

    if len(username)<6:
        raise InvalidUsernameError(f"usernme must be at least 6 character was: {len(username)}")
    
    contains_number: bool = False
    for c in username:
        if c.isnumeric():
            contains_number = True
    
    if contains_number:
        return True
    else:
        raise InvalidUsernameError("username must include at least one number")

# All errors in Python are Runtime. There are no checked exceptions
# There is no way to know if a function raises an error until you actually call it
try:
    validate_username("a123")
except InvalidUsernameError as e:
    print(e.error_description)
    print(e)
    