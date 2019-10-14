CREATE SCHEMA IF NOT EXISTS book;
SET SCHEMA book;
create table "book"(
id UUID PRIMARY KEY,
isbn varchar(255) NOT NULL,
name varchar(255) NOT NULL
);

create table "author"(
id UUID PRIMARY KEY,
name varchar(255) NOT NULL
);