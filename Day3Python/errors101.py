# Python has errors and execptions. The exceptions usally have error in the name
# The only REAL error is a syntax error. Exceptions are all LOGIC based.

# Why do programs have exceptions at ALL?
# if an error manages to avoid being caught by an except block all the way up the program
# your application may crash
def celcius_to_farenheit(c):
    try:
        f = c*9/5 +32
        return f 
    except TypeError : # this except block will only catch TypeErrors
        print("Input must be an int or float")
    except:
        print("Some other error must have occured")
    finally:
        print("This code WILL always execute if there is an error or NOT")
    

x = celcius_to_farenheit(8)
print(x)
print("last bit of code")

# whenever you write code that has a possiblity of FAILING
# you can surround the code in a try: except block
# in the except clause you can OPTIONALLY put a type of error to check for
# putting NOTHING is a catch ALL
# the catch all blank except should ALWAYS go last
# ONLY ONE except block is executed when an exception is caught
