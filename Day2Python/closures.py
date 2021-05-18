
def outer(name):

    greeting ="How are you " + name
    
    def innner():
        print(greeting)
    
    return innner

adam_greeter = outer("Adam")
bill_greeter =outer("Bill")
adam_greeter()
bill_greeter()


def is_palindrome(phrase: str):

    def reverse(word):
        return word[::-1]
    
    if phrase == reverse(phrase):
        return True
    else:
        False
