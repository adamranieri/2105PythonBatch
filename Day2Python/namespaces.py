# LEGB namespaces
# Local
# Enclosing
# Global
# Built - in
# When you define a variable the namespace  determines where you access it
# what variable you are referring to

# Highest level name space
# built in namespace the variables and functions that are built- in to the language
# print(id)

# global name space is any variable or funciton defined at the TOP-level of a python file
x = 100 # this is a global variable 
# it can be used anywhere in this file or used in another file




# local variables are defined WITHIN a function or a code block
def say_hello():
    greeting = "Hello everyone" # greeting is a local variable it is NOT global
    # you cannot use it outside of this function
    # you cannot get it another file
    print(greeting)

say_hello()



