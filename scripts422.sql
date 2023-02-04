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
                    car_id INTEGER PRIMARY KEY,
                    FOREIGN KEY (car_id) REFERENCES human(id)
);


SELECT student.name, student.age, faculty.name
FROM student INNER JOIN faculty
ON faculty.id = student.faculty_id;


SELECT student.name, student.age, faulty.name
FROM student INNER JOIN faculty ON
        avatar.id = student.id;