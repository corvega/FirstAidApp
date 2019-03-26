create database if not exists firstAid;

create table if not exists firstAid.Users(
    id int primary key auto_increment,
    fName varchar(100),
    lName varchar(100)
);

create table if not exists firstAid.Answers(
    id int primary key auto_increment,
    userId varchar(100),
    questionId varchar(100),
    userAnswer varchar(100)
);

create table if not exists firstAid.Questions(
    id int primary key auto_increment,
    questionText varchar(100),
    questionAnswer int(2)
);

-- POPULATE TABLES
insert into firstAid.Users (fName, lName) values ("Test","Tester");
insert into firstAid.Users (fName, lName) values ("John","Appleseed");
insert into firstAid.Users (fName, lName) values ("John","Smith");

insert into firstAid.Questions (questionText, questionAnswer) values ("The Answer is 1",1);
insert into firstAid.Questions (questionText, questionAnswer) values ("The Answer is 2",2);
