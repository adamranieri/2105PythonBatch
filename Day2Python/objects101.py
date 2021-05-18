# In Python EVERYTHING is an object
# you can create your own objects by defining classes

# function vs method
# function is named block of code that you can execute that is not attached to an object
# method is a named block of code that IS attached to an object
# if you write a method that does not use self in some way you really just wrote a function

# class names are in Camel Case
class Person:
    
    # class variables are defined at the top of the class
    # essentially the same as a static variable in Java
    counter = 0


    # a constructor will create an instance of this class
    # a constructor MUST be named __init__(self)
    # in Java/JS/C# you would define the instance variables at the top of the class
    # THERE IS NO OVERLOADING IN PYTHON
    def __init__(self, name: str, age: int ) -> None:
        # instance variables are created and declared in the constructor using self.varble = ''
        self.name = name
        self.age = age
        Person.counter += 1
        
    
    # any method in Python for a class has self as the first parameter
    def introduce_self(self):
        print(f"Hello my name is {self.name} and am {self.age} years old")

    # dunder methods are special methods in python that begin and end in __dunder__
    # You are encouraged as a developer to override (re-implement) them for a class as need

    # this is the dunder method that gets called whenever you put str(object)
    # this is the string that it returns
    # It is just like the toString method in Java
    def __str__(self) -> str:
        return f"name: {self.name}, age: {self.age}"
    


    

# name and age are instance variables
# there is of each variable PER person created
adam = Person("Adam",19)
print(adam.name)
print(adam.age)

bill = Person("Bill",30)
print(bill.name)
print(bill.age)

# in most programming languages the instance is implictly passed into a method
# in python it must be explicitly 
adam.introduce_self() # this a alternate syntax to the below code
# IDENTICAL code
Person.introduce_self(adam)
bill.introduce_self()

# A class variable is attached to the class itself and is accessed via the class' name
print(Person.counter)

# Python is all about being as explicit as possible.
# variables with self. in front of them belong to the object created 
# variables with the class name in front of them belong to the class itself

a = str(adam)
b = str(bill)
print(adam) # print statements automatically use str(object) implicitly print(str(adam))
print(bill)
