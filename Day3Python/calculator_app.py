# This console application allows you to add two numbers together
# Exceptions and try excepts add resiliency to your code
# If all inputs are correct and everything is how it is supposed to be (Happy Path Execution)
# Exceptions are for when code does not follow happy path execution
print("Awesome adding app")
in1 = input("Enter your first number")
in2 = input("Enter your second number")

try:
    num1 = float(in1)
    num2 = float(in2)
    sum = num1 + num2
    print("The sum is {}".format(sum))
except ValueError:
    print("That was an invalid number :[")
finally:
    print("I print at the end")

