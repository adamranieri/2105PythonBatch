
# Java for loop: for(int i =0;i<100;i++){code}

# Python uses ranges for iterating a piece of code a fixed amount of times

#range(startnumber, targetnumber(exclusive))
# for i in range(0,10):
#     print(i)

# the third parameter is the step (how much to increment or decrement if negative)
# for j in range(10,0,-1):
#     print(j)

# for x in range(100,1000,3):
#     print(x)



names = ["Adam","Bob","Alice","Tim"]

#YOU SHOULD ALMOST NEVER be creating a range to iterate over a list
for x in names: # iterate over a list
    print(x)

# Strings are iterable
hello = "Hello"

for c in hello:
    print(c) # print out each character

# Technically the same but do not do. Looks way worse and harder to read
for i in range(0,len(hello)):
    print(hello[i])

# iterate 12 times
for l in range(12):
    print(l)

# print(hello[1]) # prints outs just e

for i,c  in enumerate(hello):
    if i == 1:
        print(c)

x = 909

for x in range(0,19): # x will initalize to 0 at the start of the for
    print(x)

print(x) # 18