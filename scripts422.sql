INNER JOIN human ON human.id = car.id;
CREATE TABLE human(
                      name TEXT PRIMARY KEY,
                      age INTEGER PRIMARY KEY,
                      license BOOLEAN PRIMARY KEY,
                      id INTEGER PRIMARY KEY
);

CREATE TABLE car(
                    stamp TEXT PRIMARY KEY,
                    model TEXT PRIMARY KEY,
                    cost INTEGER PRIMARY KEY,
                    id INTEGER PRIMARY KEY
);


INNER JOIN faculty ON faculty.id = student.faculty_id;
SELECT student.name, student.age, faculty.name
FROM student INNER JOIN faculty;


SELECT student.name, student.age, faulty.name
FROM student INNER JOIN faculty ON
        avatar.id = student.id;