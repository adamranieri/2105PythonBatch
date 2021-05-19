# a lambda is an anonymous function
# () =>{}
# popular in funcitonal programming


nums = [1,2,3,4,5,6]
result = map(lambda n : n*10,nums)
# Lambdas are NOWHERE near as common or useful in python as in other languages JS
for r in result:
    print(r)