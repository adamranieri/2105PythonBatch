# a simple greeting app that supports saying hello in many different languages
import english # import the python file (A python file is called a module)

from spanish import hola 
from germanic_languages.german import gutentag

name = "Adam"

english.hello(name) # if you import just the module 
# you have to use the module name to access the global funcitons anvariables

# if you use from you can specify what functions you want it particular and do not need to 
# prefix with the module name
hola(name)

gutentag(name)


# Python is an interpreted language that executes line by line 
# Most python interpreters (the software that reads you python code and executes it)
# will (compile imported files into lower level code native the the computer)
# by default .pyc C  implemention of your python code

# A python file is a module
# A folder that contains one or many python modules is called a package
# __init__.py file in a package Older versions of python required this exact file name
# to be in a package otherwise it would not import the modules correctly

# every module has a built-in variable called __name__
# the value of that variable is the name of the module
# UNLESS you are running that module directly

# the __name__ value is "__main__" if it is the file you are DIRECTLY executing otherwise it 
# is the name of the file
print(__name__)

# Essentially python's way of creating a entrypoint main method that you might see in 
# other programming languages
if __name__ == "__main__":
    print("I can only run if you direclty execute this file")