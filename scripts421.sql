CREATE TABLE student(
    age INTEGER CHECK ( age > 16 )
);

CREATE TABLE student(
    name TEXT NOT NULL UNIQUE
);

CREATE TABLE faculty(
    color TEXT PRIMARY KEY
);

CREATE TABLE student(
    age TEXT DEFAULT '20'
);

