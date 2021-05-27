# Database
 - It stores infomation in a PERMANENT physical way
    - Storing information in disk drive
    - magnetic tap
    - cuneiform tablets
- If you turn of the power information is still there
- Types of databases
    - relational databases
        - store infomation in tables and connect those tables to each other
        - ex
            - postgres
            - MariaDB
            - Oracle (yuck)
            - Microsoft SQL Server
            - MySQL
    - NoSQL databases
        - store information in documents
        - sometimes as just massive JSONs
    - REDIS
        - Key value pair

# SQL Structured Query Language
- Is a programming language for working with databases
- DSL (Domain Specific Language) fancy term for saying that the lanugage was written to do a specific thing.
- For SQL that was querying and working with databases
- Very old for langauges, it came out in the 70s
- There are many dialects of SQL

# Relational Database structure
- Information is stored in **tables**
- Tables are comprised of rows(records) and columns(attributes)
- You can connect these tables together using a foreign key 
- The tables and rules regarding those tables are called the **schema**

# Normalization
- The process by which we eliminate redundancy in our relation database
- Normalized does NOT mean better
- 1NF
    - Each record has to be unqiuely identifiable
        - unique unchanging primary key
    - The attributes should contain atomic information
        - Cannot be broken down into more meaningiful columns
        - Do not store array-like information in a column
            - DO NOT store string containing 5 phone numbers
- 2NF
    - You 1NF
    - No Functional dependencies
        - You cannot create a column that could computed using other columns
            |player_id|attempted|made|shooting_percentage|
            |---------|---------|----|-------------------|
            |101      |200      |50  | 25                |

- 3NF
    - In 2NF
    - No Transitive depenedencies
        - You cannot find the data elsewhere in the database