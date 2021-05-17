# Python has your typical if else while for as most programming languages

x = 1
# Python does NOT use curly brackets
# It uses colons, new lines and indenting to create 'blocks' of code
if x < 10:
    print("The value is less than 10")
elif x==10: # else if
    print("The value is 10")
else:
    print("The Value is 10 or greater")

i = 0
while i<100:

    if i % 2 == 0:
        print("even" + str(i))
    else:
        print("odd" + str(i))
    
    if i == 50:
        break
    
    i = i + 1
    # identical to
    # i += 1 
print(i)# 100

