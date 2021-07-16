# Preamble
This is a guide for the upcoming interivews.  I said it in training and I will say it again KNOW YOUR COLLECTIONS FRAMEWORK!!!!
## Core Technologies
I think these are the core technologies you will be asked.
- ***Java***
    - Scopes
    - Access Modifiers
    - Pillars of OOP
    - **Collections Framework**
- ***SQL***
    - Queries
    - Normalization
    - Constraints
- ***Testing***
    - Selenium
    - Cucumber
    - SDLC / STLC/ Bug Defect Lifecycle
    - Types of Testing

I got the impression Python was not their highest priority but you need to know your basics and feel comfortable in the language. 
## Non-Technical Skills
You will always be asked soft skills questions. Employers want to hire people they think will get along and work in team environments.
- ***Agile***
    - How did you stay agile
    - How did you communicate with each other
- ***Project Management***
    - Documentation
    - Tracking Application 
    - Describing the project as a whole and what you did on it



# Essential Technical Questions
These are questions you ***NEED*** to be able to answer.

- **Java**
    - Scopes in Java?
    - 4 pillars of OOP?
    - What is the Collections Framework?
        - What is a List?
        - What are some implementations of a list?
        - What is a Set?
        - What is a queue
        - What is a Map?
        - Difference between a List and a Set?
        - Is a Map a collection?
        - What is the root class of collection hierarchy?
        - Collection interface vs Collections class
    - Access Modifiers 
    - What is the entry point of a Java program?
    - What is the method signature of the main method?
    - What does the static key word do?
    - Can you tell me keywords that are not access modifiers?
- **SQL**
    - What is SQL?
    - How can I join a table on a column?
    - What is normalization?
    - When is a table in 1NF?
    - When is a table in 2NF?
    - When is a table in 3NF?
    - Tell me SQL constraints.
    - What is a primary key?
    - How do I make a Foreign key?
- **Testing**
    - What is a positive test?
    - What is a positive test for a scenario X?
    - What is a negative test?
    - What is a functional Test?
    - What is a performance testing?
    - Manual vs automated test?
    - What is acceptance testing?
    - What is a unit test?
    - What is an integration test?
    - What is an e2e test?
    - Black box vs white box testing?
    - Tell me about the STLC?
    - Walk me through the defect lifecycle?
- **Selenium**
    - How do I set up a web driver?
    - What are the different element locators/selectors?
    - What is the POM?
    - How do I make a POM?
    - Why would I make a POM?
    - How do I type into a form?
    - How do I click on a button?
    - What is Xpath?
    - Absolute vs Relative Xpath?
    - What are waits?
    - Explicit vs implicit wait?
- **BDD** 
    - What is BDD?
    - What is the the general workflow of BDD?
    - What are user stories?
    - What are features?
    - What are scenarios?
    - What is acceptance criteria?
    - How are acceptance criteria different from user stories
    - What are business requirements?
    - If I gave you business requirements what would be your next step?
    - How could you ensure that all of your business requiremnts for the project have been met?
    - Walk me throught the SDLC

# Essential Soft Skill Questions
- Tell me about yourself?
- What are you interested in?
- What do you like about development?
- What do you like about testing?
- What was your favorite thing to learn?
- What have you been learning?
- Where do you see yourself in a few years?
- How do you get into a good work mindset?
- How did you communicate in your project?
- What was your last project?
- Walk me through the technology stack of your last project?
- What did you do on your last project?
- What was something you learned on your last project?
- How did you stay agile?
- What agile ceremonies did you do?

# SQL Practice
There is a high chance you will be asked to write a SQL query. The chinook database is a practice database. Run the script here in your DB to get it.
https://raw.githubusercontent.com/lerocha/chinook-database/master/ChinookDatabase/DataSources/Chinook_PostgreSql.sql
- Querying practice
    - Select all records from the Employee table.
    - Select all records from the Employee table where last name is King.
    - Select all records from the Employee table where first name is Andrew and REPORTSTO is NULL.
    -  Select all albums in Album table and sort result set in descending order by title.
    - Select first name from Customer and sort result set in ascending order by city
    - Select all invoices with a billing address like “T%”
    - Select all invoices that have a total between 15 and 50
    - Select all employees hired between 1st of June 2003 and 1st of March 2004
- Insert practice
    - Insert two new records into Genre table
    - Insert two new records into Employee table
    - Insert two new records into Customer table
- Update Practice
    - Update Aaron Mitchell in Customer table to Robert Walter
    - Update name of artist in the Artist table “Creedence Clearwater Revival” to “CCR”
- Joins
    - Create an inner join that joins customers and orders and specifies the name of the customer and the invoiceId
    - Create an outer join that joins the customer and invoice table, specifying the CustomerId, firstname, lastname, invoiceId, and total.
    - Create a right join that joins album and artist specifying artist name and title.
    - Create a cross join that joins album and artist and sorts by artist name in ascending order.
    - Perform a self-join on the employee table, joining on the reportsto column.
- Set Operators
    - Use a unionall to create a table that has the name of all employees and customers








