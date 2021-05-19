# Inheritance in Python
# Inheritance is the ability of one class to recieve attributes from another class
# attributes are instance variables self.something and the methods def m(self)
# Python DOES have multiple inheritence (It is very rare to actually have to use multiple inheritence)

class Employee:


    def __init__(self, e_id:int, f_name: str, l_name: str) -> None:
        self.e_id = e_id
        self.f_name = f_name
        self.l_name = l_name

    def __str__(self) -> str:
        return f"The employee is {self.f_name} {self.l_name}"



# you pass in the parent class Trainer inherits Employee
class Trainer(Employee):
    
    def __init__(self, e_id: int, f_name: str, l_name: str, favorite_language: str) -> None:
        print("In trainer contstrutor")
        super().__init__(e_id, f_name, l_name) # IN PYTHON
        # EXPLICITY create your PARENT user the Parent class init dunder method
        self.favorite_language = favorite_language
    
    ## the double underscores are the DUNDER methods aka Magic Methods
    def __str__(self) -> str:
        return f"Trainer is {self.f_name} {self.l_name} and favorite language is {self.favorite_language}"
    

adam = Trainer(202,"Adam","Ranieri", "TypeScript")
print(adam)

# Duck typing if it looks like a duck and quacks like a duck it is a duck
# duck.quack() and it give you he output you want you might as well treat it like a duck