create database personal_expenses;
use personal_expenses;

create table category(
	id int primary key not null auto_increment,
    name varchar(250) not null
);

create table user(
	id int primary key not null auto_increment,
    name varchar(100) not null,
    email varchar(100) not null
);

create table expenses(
	id int primary key not null auto_increment,
    describing varchar(250) not null,
    value decimal(10,2) not null,
    date_expenses date not null,
    user_id int not null,
    category_id int not null,
    foreign key (user_id) references user(id),
    foreign key (category_id) references category(id)
);
