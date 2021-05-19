# Common Errors in Python
# LookUpError: get an index that does not exist from a list or tuple or use dictionary key that does not exist
# TypeError: when you pass in a variable that is of the wrong type (pass in a str instead of int/float)
# ValueError: when the type is right but the value of that variable is wrong
# NameError: you reference a variable that does not exist

# OFTEN functions will raise errors and NOT handle them
# For functions that might be used throughout the program you can handle the errors
# differently / most appropriately
def celcius_to_farenheit(c):

    # Exceptions give you information on WHY something failed
    # And you might want to address them different
    if type(c) != int and type(c) != float:
        raise TypeError("Temperature must be a numeric type") # all errors are objects
    if c < -273:
        raise ValueError(f"Input Temperature {c} is below absoulate zero -273 C")

    f = c*9/5 +32
    return f 

try:
    result = celcius_to_farenheit(-400)
except TypeError as e: # if you want the object put 
    print(e) # prints out the message you passed when you created the Error
    # the __str__ for errors is to return the message it was created with
except ValueError as e:
    print(e)
except Exception as e:
    print(type(e)) # is a value error


