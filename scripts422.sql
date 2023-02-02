CREATE TABLE human(
                      name TEXT PRIMARY KEY,
                      age INTEGER PRIMARY KEY,
                      license BOOLEAN PRIMARY KEY
);

CREATE TABLE car(
                    stamp TEXT PRIMARY KEY,
                    model TEXT PRIMARY KEY,
                    cost TEXT PRIMARY KEY
);

SELECT car, human ON human = car;


SELECT student.name, student.age, faculty.name
FROM student INNER JOIN united;

SELECT student.name, student.age, faulty.name
FROM student INNER JOIN studentsByAvatars ON
        avatar.id = student.id;