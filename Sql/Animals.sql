create database friendsOfHuman;

use friendsOfHuman;

drop table if exists home_pets;
create table home_pets (
id int auto_increment primary key,
animal varchar(50),
name varchar(50),
date_of_birth date);

insert into home_pets (animal,name,date_of_birth) 
values 
('Cat','Kitty','2023-05-28'),
('Dog','Ben','2022-03-13'),
('Hamster','Blacky','2024-02-23');

select*from home_pets;

drop table if exists pack_animals;
create table pack_animals (
id int auto_increment primary key,
animal varchar(50),
name varchar(50),
date_of_birth date);

insert into pack_animals (animal,name,date_of_birth) 
values 
('Horse','Ignat','2020-01-22'),
('Donkey','Donkiii','2021-07-07'),
('Camel','Whitepearl','2019-04-16');

select * from pack_animals;

delete from pack_animals
where animal = 'Camel';


select * from home_pets
where date_of_birth < '2023-05-30' and date_of_birth > '2021-05-30';

create table young_animals as 
(select * from home_pets
where date_of_birth < '2023-05-30' and date_of_birth > '2021-05-30' 
union all
select * from pack_animals
where date_of_birth < '2023-05-30' and date_of_birth > '2021-05-30');

select * from young_animals;

select *, 
sum(TIMESTAMPDIFF(month,date_of_birth,curdate())) over(partition by name) as age
from young_animals;




