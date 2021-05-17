
# function is a a reusable chunk of code
# they can have parameters where you pass in arguments

# def for define
# void functions do not return anything (if you do not return something from a function is returns the None object)
def hello():
    print("This is a simple function")
    print("It just says Hello!!")

def greet_person(name: str):
    print("Hello" + name)

# x = hello()
# print(x)
# I HIGHLY reccomend using type annotaions for your functions
def greater_number(num1:float, num2:float) -> float:
    if num1 > num2:
        return num1
    else:
        return num2
    
i= greater_number(90.1, 154.2)
print(i)

# takes in a string and returns how many vowels it has
def num_caps(phrase: str) -> int:
    counter = 0

    for c in phrase:
        if c.isupper():
            counter +=1

    return counter
      

ups = num_caps("sldnDALKfsdfknweoiDDS")
print(ups)
    
def multi_print(phrase: str, times: int) -> None:
    for i in range(times):
        print(phrase)
    
# in python you can pass arguments in positionally like, Java or JS
multi_print("Hello Everyone",10)

#you can pass in functions using the named variables
# identical to the previous function call
multi_print(times = 10, phrase="Hello Everyone")
multi_print(phrase ="Hello Everyone", times=10)