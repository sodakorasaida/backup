drop databese if exists testdb;
create database testdb;
use testdb;

create table users(
user_id int primary key auto_increment,
user_name  varchar)