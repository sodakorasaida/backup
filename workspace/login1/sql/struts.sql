drop database if exists login1db;
create database login1db;
use login1db;

create table users(
	user_id int primary key auto_increment,
	user_name varchar(255),
	password varchar(255)
	);

insert into users values(1,"taro","123");
insert into users values(2,"jiro","456");
insert into users values(3,"hanako","789");