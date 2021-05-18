# Python common data structures
# data structures are just ways for us to store information for easy access and use
names = ["Adam", "Bill", "Steve"]

# lists will reisize as needed and can store any type
# lists are MUTABLE always add or remove elements
# lists can contain duplicates

stuff = ["Apple", 4, [[],1], 9.8, 4 ,4 ,4 ,4]
print(stuff)
stuff2 = stuff # points to the same list
print(stuff2 is stuff) # NOT THE EQUALITY operator. Are they the same EXACT OBJECT IN MEMORY
# to create a list
my_list = []
print(my_list)
my_list.append("Hello")
print(my_list)
my_list.append("World") # always adds at the end of the list
print(my_list)
# delete an item from a list
del my_list[1]
print(my_list)
my_list.insert(1,"!")

stuff2.append("Added just random string")
print(stuff)
