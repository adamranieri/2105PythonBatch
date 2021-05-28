# Database
- Saves information in a permanent phyical medium

## Relational Database
- Stores information in tables
- Tables can be related to each other via foreign keys
- RDBMS (Relational Database management System)
    - software responsible for managing your database
        - Postgres
        - MySQL
        - Oracle (yuck)
        - MariaDB
- The **Schema** is the entire structure and rules of the databse
    - Tables
    - constraints
    - Foreign key relationships

### Tables
- Columns/fields/attributes
- Rows/records
- Columns can have **constraints**
    - primary key
        - Primary identification for a record
    - unique
    - not null
    - check
    - default
    - foreign key
        - Connect a child table to a parent 

# SQL
- Structured Query Language
- Scripting language, it is a programming language
    - Designed for working with databases
    - Scripts tell a computer what to do

## Sublanguages of SQL
- DQL (Data Query Language)
```sql
    -- anytime you use the SELECT keyword
    select * from employee;
```
- DDL (Data Definition Language)
- Anything that defines the SCHEMA of the database (tables,constraints)
```sql
create 
alter 
drop
```
- DML (Data manipulation Language)
- Anything that alters DATA in a table
```sql
set update
insert 
delete
```
- TCL (Transaction control language)
- Any command that handles transaction
- Any SQL statement(s) is not made permanent until a commit command is executed
- rollback will undo any statements since the last commit
```sql
commit 
rollback
save point -- checkpoint in the middle of transcation
```
- DCL (Data Control Language)
- Commands that grant  access and permissions to the database
- This is not security for end users
```sql
grant
revoke
```

## Referential integrity 
- Records should never be orphans
- Records can connect logically together
- Foreign keys keys are used to link together tables
    - You place a foreign key on a child table and it references a field on the parent table
- Conneting tables together creates three types of multiplicities
    - one - many
        - A parent record might have many child records
        - team - player
    - one - one
        - not that common
    - many - many
        - not always a child parent relationship
        - Often occurs when two records can exist independently of each other
        - junction table is used to map this relationship
            - Two foreign keys 
            - records that show the many links between the two tables
        - player - game

## Normalization
- Process reducing redundancy in a database
- Normalization is NOT a shorthand for better
- The more transactions create,update,insert that a database has the more normalized.
- 1NF
    - the data in a column is atomic
        - you cannnot break the data into smaller more meaningful chunks
        - Not storing array like information in a field
    - primary key as a way to uniquely identify every record
- 2NF
    - 1NF
    - The table has no functional dependencies
        - cannot calcualte one column based on the value of other columns
- 3NF
    - 2NF
    - No Transitive dependencies 
        - cannot find information in a column that could be found elsewhere in the database

## Joins and set Operators
- Normalized databases are difficult to query
    - information is sperad out across many tables
- Joins are used to denomalize a database by combining tables on a predicate
```sql
left join -- every record on the left and any matching recods on the right
right join -- every record on the right and any matching recods on the left
inner join -- only records that match
cross join -- every record mathced with every record
outer join -- only records that do not match
select coach.name from coach left join player on coach.t_id = player.t_id
```
- set operators stack two tables on top of each other
    - there is no matching involved
    - The only requirement is that the tables have the same number of columns
        - some RDBMS that they are also the same type
```sql
union
```

## functions
- SQL does have functions
- You can create your own 
- two main types
    - aggregate
        - sum(), avg(), max(), min()
    - scalar
        - upper(), lower()

## transactions
- a single or group of SQL statements to be executed together
- transaction are ACID compliant in essentially all RDBMSs
    - Atomic
        - Not a single SQL statement commits unless all statements are successful
    - Consistent
        - A database's state moves from one state to another without there being a half saved intermediary point.
    - Isolated
        - Concurrent transactions should not tamper with each other
    - Durable
        - Failed transactions should be handled gracefully. No data corruption if something fails etc..

















