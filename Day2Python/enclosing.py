welcome = "Global welcome variable"

def greet():
    welcome = "local welomce variable" # creates a brand new variable also called welcome
    print(welcome) # LEGB to deterime what this welcome variable refers to 
    # the nearest namespace is the local one defined on like 5

name = "Globy McGlobeFace" 
# if python cannot find an enclosing one it will check the global namespace for a variable named name
if True:
    name = "Enclosing McEnclose" #if python cannot find a local variable named name it see if
        # there are enclosing variables of that name
    if True:
        name = "Enclosing McEnlose Junior "
        if True:
            name = "Local McLocal" 
            print(name) # python will look for a local variable named name
            #print(noexist) 
            # python 
            # checked local: not found: 
            # check enclosing: not found, 
            # checked global: not found
            # checked built in: not found
            # NameError

