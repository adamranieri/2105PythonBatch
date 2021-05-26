
-- SQL is a scripting language (commands for a machine to execute. Once executed that machine is changed)
create table employee(emp_name varchar(50), salary int); -- create a table

-- * means all the attributes in the table
select * from employee; -- view the entire table

insert into employee (emp_name, salary) values ('Bob Smith', 40000);
insert into employee (emp_name, salary) values ('Jane Doe', 600000);
insert into employee (emp_name, salary) values ('Paul McTest', 90000);
insert into employee (emp_name, salary) values ('Temp McIntern', 0);
insert into employee (emp_name, salary) values ('Bill Jacobs', 40000);
insert into employee (emp_name, salary) values ('Bill Jacobs', 40000);
insert into employee (emp_name, salary) values ('Bill Jacobs', 40000);

delete from employee; -- will delete every record in the table

-- basic querying syntax

-- select attributes from table where condition
select salary from employee;

-- where clauses are essentially a filter they affect HOW MANY records you get back
select emp_name from employee where salary < 100000;

select * from employee where emp_name = 'Jane Doe';

-- there is a like clause
-- % are a wild card %e% start with anything has e ends with anything
select * from employee where emp_name like '%e%';
select * from employee where emp_name like 'B%';


-- Sub languages of SQL

-- DQL Data Query Language
-- Any select statement
select emp_name from employee where salary < 100000;
select salary from employee;

-- DML Data Manipulation Language 
-- commands that edit the information in your table
insert into employee (emp_name, salary) values ('Bob Smith', 40000);
delete from employee;
update employee set salary = 15000 where emp_name = 'Temp McIntern';

-- DDL Data Defintion Lanuage
-- commands that DEFINE the SCHEMA of the databse
-- they create, alter and delete the tables themselves
create table employee(emp_name varchar(50), salary int);
drop table employee;

-- DCL Data Control Language
-- commands that edit access and authorizations to a database
-- grant and revoke
-- In proper deployed databases regular developes will have certain permission
-- you might only have view permission, maybe unable to edit certain tables


-- TCL Transaction control Language
-- Commands for commiting and rolling back transation
-- To be continued....


-- All records in a table should be uniquely identifiable
-- primary key (a column that is unique and unchanging for a record)

create table employee(
	emp_id int primary key generated always as identity,
	emp_name varchar(50) , 
	salary int
);

insert into employee (emp_name, salary) values ('Bob Smith', 40000);
insert into employee (emp_name, salary) values ('Jane Doe', 600000);
insert into employee (emp_name, salary) values ('Jimmy SmartyPants', 70000000);
select * from employee;

drop table employee;


create table employee(
	emp_id int primary key generated always as identity,
	first_name varchar(50),
	last_name varchar(50),
	salary int
)

insert into employee (first_name, last_name, salary) values ('Bob','Smith', 40000);
