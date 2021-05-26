
-- Tables should be named in singular. a table name should represent what a single record in the table is
create table book(
	book_id int primary key generated always as identity,
	title varchar(50),
	author varchar(50),
	available bool,
	quality int,
	return_date bigint -- timestamp might end up very large
)

insert into book (title,author,available,quality,return_date) values ('It','Stephen King',true,1,0)
select * from book;

select * from book where book_id = 5

update book set title='', author='', available=false, quality=1,return_date=0 where book_id =1

delete from book where book_id =3