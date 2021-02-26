-- DONE: save all db objects here

create database if not exists books;

use books;

create table if not exists book
(
`id` int auto_increment primary key,
`title` varchar(100) not null,
`author` varchar(100) not null,
`publish_date`date
);
