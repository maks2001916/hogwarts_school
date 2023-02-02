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




SELECT student.name, student.age, faculty.name
FROM student INNER JOIN united;

SELECT student.name, student.age, faulty.name
FROM student INNER JOIN studentsByAvatars ON
    avatar.id = student.id, avatar.id