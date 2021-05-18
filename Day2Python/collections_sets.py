# Sets
# Sets are MUTABLE add, remove, edit
# Sets do NOT allow duplicates
# Sets can store any types
# Sets will increase and descrease dynamiclly in size
# Sets DO NOT MAINTAIN THE INSERTION ORDER of elements inside of them
# Sets are NOT INDEXABLE

wvu_eployees = {"Adam", "Richard", "Sierra", "Dan", "Ryan"}
wvu_eployees.add("Steven")

# print(wvu_eployees[2]) # ERROR cannot get by index

wvu_eployees.add("Steven")
wvu_eployees.add("Steven")
wvu_eployees.add("Steven")
for employee in wvu_eployees:
    print(employee)

print("Adam" in wvu_eployees)
