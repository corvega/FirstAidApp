create database if not exists firstAid;

create table if not exists firstAid.Users(
    id int primary key auto_increment,
    fName varchar(100),
    lName varchar(100)
);
