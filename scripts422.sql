CREATE TABLE human(
                      name TEXT PRIMARY KEY,
                      age INTEGER PRIMARY KEY,
                      license BOOLEAN PRIMARY KEY,
--                       id INTEGER PRIMARY KEY,
                      FOREIGN KEY (id) REFERENCES car(car_id)
);

CREATE TABLE car(
                    stamp TEXT PRIMARY KEY,
                    model TEXT PRIMARY KEY,
                    cost INTEGER PRIMARY KEY,
                    car_id INTEGER PRIMARY KEY
);


SELECT student.name, student.age, avatar.name
FROM student INNER JOIN avatar
ON avatar.id = student.faculty_id;


SELECT student.name, student.age, faulty.name
FROM student INNER JOIN faculty ON
        avatar.id = student.id;