# A lot of times you want to generate a list based of a range or another list
# A list comprehension is a really compact syntax

# create a list of negative numbers
nums = [1,2,-5,6,-6,10,12,-13]

# negs = []

# for n in nums:
#     if n < 0:
#         negs.append(n)
# print(negs)

# nums2 = [element for element in iterable if boolean_condition ] 
nums2 = [n *-1 for n in nums if n < 0]
print(nums2)

nums2 =[]
for n in nums:
    if n < 0:
        nums.append(n*-1)

names = ["tim", "Adam", "steve"]

# [map(x) for iterable if filter(x) ]
super_names = [name for name in names]

print(super_names)

