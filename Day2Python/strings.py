# Strings are one f the most common data types in any programming lanugage

# A string literal is just defining a string as such
name = "Adam"

# String interpolation putting variables into a string
greeeting = "Hello " + name + " it is great to meet you!"
# f is format interpolate values into your string using {}
greeeting = f"Hello {name} it is awesome to see you! {7<8}"
# format method of strings
greeeting = "Hello {} is is great to see you! Also something else {}".format(name, "Wassup")

print(greeeting)

# string slicing is being able to take substrings out of a larget string

alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

# start at 0 go the the 4th character. That is exclusive 
abc = alphabet[0:3]
jk = alphabet[9:11]

# negative index 
# print(alphabet[len(alphabet)-1])

# -1 is the last element -2 second to last etc
# print(alphabet[-1])

# the last argument is the step 
everyother = alphabet[0::-2]
# print(everyother)

# reverse a string in python
zyx = alphabet[::-1]
print(zyx)
l =  list(alphabet) # generates a brand new list
del l[2]
print("".join(l))# brand new string

# you can make anything a string by using the str function

x = 100
y = str(x)
print(type(y))

# strings are immutable
# cannot be altered once created

phrase = "hello everyone"
# phrase[8] = "A" # throws an error becuase strings CANNOT be altered once created

