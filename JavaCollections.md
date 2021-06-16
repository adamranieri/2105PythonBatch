
# Java Collections Framework
![Java Collections Framework](java-collection-framework-hierarchy.jpg)
- A conglomeration of interfaces and classes for storing objects

## Key Interfaces
- Iterable
    - Root Interface of the collections framework
- Collection
    - Contains very generic methods that we associate with all collections
        - size()
        - add()
- Queue
    - Store objects in a FIFO (First in first out fashion)
    - Dynamically resizes
- List
    - Dynamically resizes as you add elements
    - Can contain duplicates
    - Does maintain the order of insertion
- Set
    - Dynamically resizes as you add elements
    - Cannot contain duplicates
    - Do not maintain the order of insertion
- Map
    - NOT ITERABLE 
        - YOU CANNOT LOOP THROUGH A MAP
        - You can get the values of a map then iterate through the values but not the map itself
    - Store objects as key value pairs
    - Technically not a Collection but is part of the collections framework

### Python Cheatsheet
- Python List = Java List
- Python Set = Java Set
- Python Dictionary = Java Map
- Python Tuple = There is not a good Java corrallary

### Collections Framework vs Collection Interface vs Collections class
- Collections Framework
    - group of interaces and classes for storing objects
- Collection interface
    - Primariy interface used by many interfaces in the framework
- Collections
    - A utilty class with static methods for working with collections



