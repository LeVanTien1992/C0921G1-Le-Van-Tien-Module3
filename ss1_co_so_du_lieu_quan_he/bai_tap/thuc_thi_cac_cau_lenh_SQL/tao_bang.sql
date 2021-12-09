create database student_management_mysql;

use student_management_mysql;

create table class(
	id int primary key,
    `name` varchar(50) not null
);

insert into class
values 
(1, 'Le Van Tien'),
(2, 'Le Van Teo'),
(3, 'Le Van Ti');

update class
set `name` = 'Bruno Mark'
where id = 1;

update class
set `name` = 'Donal Trump'
where id = 2;

update class
set `name` = 'Elon Mark'
where id = 3;

select id, `name`
from class;

select id
from class;

select `name`
from class;

delete from class
where id =1;


create table teacher(
	id int primary key,
    `name` varchar(40),
    age int,
    country varchar(50)
);

insert into teacher
values 
(1, 'Le Van Tien', 17, 'Viet Nam'),
(2, 'Donal Trump', 17, 'USA'),
(3, 'Elon Mark', 17, 'USA'),
(4, 'Thai Anh Van', 17, 'Dai Loan');

update teacher
set country = 'Mexico'
where id = 3;

select id, `name`, age, country
from teacher;


update teacher
set age = 20
where id =2 or id =4;

update teacher
set age = 19
where id =1;

delete from teacher
where id =3;


