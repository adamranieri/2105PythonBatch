
-- We are creating a database for a 1970's ABA basketball league
-- teams, players, coaches and games

-- we can put constraints in the values within columns. called CONSTRAINTS
-- check condition
-- unique
-- not null
-- default 
-- primary key (short hand for unique + not null)
-- foreign key
create table team(
	team_id int primary key generated always as identity,
	team_name varchar(50) unique,
	mascot varchar(50),
	hometown varchar(50) 
);

insert into team (team_name, mascot, hometown) values ('Grand Dunk Railroad', 'The Conductor', 'Funkytown');
insert into team (team_name, mascot, hometown) values ('The Nicks', 'Spike Lee', 'NYC');
insert into team (team_name, mascot, hometown) values ('The Jokers', 'Harlequin', 'Gotham');
insert into team (team_name, mascot, hometown) values ('Big Brothers', 'Cammy The Camera', 'Everytown');



-- The core feature of RELATIONAL databases is that you can connect tables to each other
-- The to do this is by creating a foreign key
-- Multiplictiy is the TYPE if relation that two tables and their records have to each other
-- one - one (you do not see these too often) player - player_stats
-- one - many one record relates to many in another table  team - player
-- one team has many players, one team might be connected to multiple players
-- many - many games - players many players will be coneccted to many games.
--  the MANY in the many to one HAS the foreign key

-- the field you put the foreign key on has to be unqiue but what it references does
create table player(
	player_id int primary key generated always as identity,
	first_name varchar(50),
	last_name varchar(50),
	salary int,
	t_id int, -- will hold the id of a team
	constraint fk_player_team foreign key (t_id) references team(team_id) -- adds a foreign key constraint	
)



insert into player values (default,'Adam', 'Ranieri',2000000,1);
insert into player values (default,'Bane', 'McEvil',1000000,3);
insert into player (first_name,last_name,salary,t_id) values ('Chillman', 'Freeze',1000000,3);
insert into player values (default,'Conan', 'Obrian',11000000,2);
insert into player values (default,'Randall', 'McEvil',5000000,2);
insert into player values (default,'Peter', 'Parker',4000000,2);

-- The table with the foreign key (the many table) is the child table
-- The parent record MUST exist before the child record
-- fails because there is not parent record with an id of 30
insert into player (first_name,last_name,salary,t_id) values ('Chillman', 'Freeze',1000000,30);

delete from team where team_id = 1;

-- You CANNOT delete parent records that have children
-- if you could you would create ORPHAN records. child records with foreign keys that point to nothing
-- Relational databases maintain REFERENTIAL INTEGRITY foreign keys ALWAYS point to a valid record

update player set salary = 4000000 where player_id = 3;

-- Noramalized databases reduce redundancy
-- Certain information you want may NOT be in a table
-- What is a player's hometown?

-- joins are a denormalization. Joins combine two tables on a join predicate
-- predicate is HOW you are mathcing records in the two tables
select * from team;
select * from player;

-- think of the join as computing a temporary table, aka views
select * from team left join player on team.team_id = player.t_id;
-- identical
select * from player right join team on team.team_id = player.t_id;
-- Left JOIN will return ALL the records in the left table + any records that match in the right table
-- all teams will be here

select * from player left join team on team.team_id = player.t_id;
-- all players will be here + any teams that have a match

-- inner joins will only returns records that match 
select * from team inner join player on team.team_id = player.t_id;
-- if a team does not have to any players it will not be retirned

-- outer joins Only records that DONT match
-- full join every RECORD
-- cross join (cartesian product everything multiplied with everything) every record matched to every record
select * from team cross join player;
-- Answer hypotetical questions and combinations

create table coach(
	coach_id int primary key generated always as identity,
	first_name varchar(50),
	last_name varchar(50),
	salary int,
	specialty varchar(50),
	t_id int,
	constraint fk_coach_team foreign key (t_id) references team(team_id)

);

select * from team;
select * from player;
select * from coach;
insert into coach values(default,'Albus','Dumbledore',10000000,'wizardy', 2);
insert into coach values(default,'SpongeBob','SquarePants',20000000,'jellyfishing', 2);
insert into coach values(default,'Mark','Hamill',500000,'Flagrant Fouls', 3);

-- set operators
-- stack one table on top of another table. there is not matching or predicate
-- the number of columns MUST be the same (some versions of SQL require that they are the same type as well)
-- you tend to use UNIONS when you have simlar data in different tables
select first_name, last_name, salary from player
union
select first_name, last_name, salary from coach;

-- many to many relationships
-- games to players
-- junction table 
-- has only two columns
-- both of which are foreign keys
-- one pointing to player one pointing to game


create table game(
	game_id int primary key generated always as identity,
	stadium varchar(50)
)

-- Do not NEED to to have a primary key
create table game_player(
	g_id int,
	constraint fk_gp_game foreign key (g_id) references game(game_id),
	p_id int,
	constraint fk_gp_player foreign key (p_id) references player(player_id)
);

-- I like to think of junction tables as a list of links that connect a player to game
insert into game values(default, 'Metlife stadium');
insert into game values(default, 'American Airlines Arena');

select * from game;
select * from player;
select * from game_player;

insert into game_player values(2,12);
insert into game_player values(1,16);

-----------------------------------------------------------------------------------------------------
-- postgres SQL does have in-built functions
-- aggregate functions (apply to multiple records) sum(), avg(), min(), max()
-- scalar functions (used on a single record)

select * from coach;

select avg(salary) from player; -- average salary of all players

-- aggregate functions CAN have a group by clause
-- I like to think of group by as putting records into buckets based on that attribute
select avg(salary), t_id from player group by t_id;

-- scalar function 
select upper(first_name) from player;

--------------------------------------------------------------------------------------------------------
-- think of the dollar signs as curly brackets {}
create or replace function multiply( num1 int, num2 int) returns int as $$
	-- any local variables need to be defined at the top of the function
	declare
		product int;
	
	begin
		product = num1 * num2;
		return product;
	end
$$ LANGUAGE plpgsql;

select multiply(90,2);
----------------------------------------------------------------------------------------------------
drop function multiply;


-- Transactions
-- transaction is a one to many sql statements
-- 'unit of interaction' all the statements in between commits
-- any DML statement is not going to be immediately saved to the database
insert into team values (default,'The Washington Generals','The General', 'DC');
insert into team values (default,'The Washington Generals1','The General', 'DC');
insert into team values (default,'The Washington Generals2','The General', 'DC');
insert into team values (default,'The Washington Generals3','The General', 'DC');
commit; -- will physically save the changes to the database
rollback; -- will undo any statements since the last commit

-- Rules regarding transactions should be ACID compliant 
-- Atomic Every statement in a transaction should work or the entire thing gets rolled back
-- Consistent Transactions move th database from from consistent state to consistent state 
-- (no point where the database is in a saved halfway point)
-- Isolated transactions should not trample on each (databases that handle multiple transactions at once)
-- Durable failed transactions should be handled gracefully. No corrupted data or data loss etc...


