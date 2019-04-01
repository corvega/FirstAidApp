create database if not exists firstaid;

create table if not exists firstaid.Users(
    id int primary key auto_increment,
    fName varchar(100),
    lName varchar(100)
);

create table if not exists firstaid.Answers(
    id int primary key auto_increment,
    userId varchar(100),
    questionId varchar(100),
    userAnswer varchar(100)
);

create table if not exists firstaid.Questions(
    id int primary key auto_increment,
    questionText varchar(100),
    questionAnswer int(2)
);

create table if not exists firstaid.Bleeding(
    id int primary key auto_increment,
    treatment varchar(100)
);

create table if not exists firstaid.Unresponsive_Breathing(
    id int primary key auto_increment,
    treatment varchar(100)
);

create table if not exists firstaid.Unresponsive_Not_Breathing(
    id int primary key auto_increment,
    treatment varchar(100)
);

-- POPULATE TABLES
insert into firstaid.Users (fName, lName) values ("Test","Tester");
insert into firstaid.Users (fName, lName) values ("John","Appleseed");
insert into firstaid.Users (fName, lName) values ("John","Smith");

insert into firstaid.Questions (questionText, questionAnswer) values ("The Answer is 1",1);
insert into firstaid.Questions (questionText, questionAnswer) values ("The Answer is 2",2);

insert into firstaid.Bleeding (treatment) values ("1. Put pressure on the wound");
insert into firstaid.Bleeding (treatment) values ("2.Call 999 as soon as possbile");
insert into firstaid.Bleeding (treatment) values ("3. Keep pressure on the wound until help arrives");

insert into firstaid.Unresponsive_Breathing (treatment) values ("1. Check their breathing by tilting their head back and looking and feeling for breaths");
insert into firstaid.Unresponsive_Breathing (treatment) values ("2. Move them onto theor side and tilt their head back");
insert into firstaid.Unresponsive_Breathing (treatment) values ("3. Call 999 as soon as possible");

insert into firstaid.Unresponsive_Not_Breathing (treatment) values ("1. Check their breathing by tilting their head back");
insert into firstaid.Unresponsive_Not_Breathing (treatment) values ("2. Call 999 as soon as possible");
insert into firstaid.Unresponsive_Not_Breathing (treatment) values ("3. Give chest compressions push firmly downwards in the middle of the chest and then release");
insert into firstaid.Unresponsive_Not_Breathing (treatment) values ("4. Continue to push in this way at a regular rate until help arrives");
