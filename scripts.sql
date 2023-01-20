SELECT *
FROM student;

SELECT *
FROM student
WHERE age > 5
  and age < 10;

SELECT student.name
from student;

SELECT *
FROM student
where name like '%i%';

SELECT *
FROM student
where age < student.id;

SELECT * from faculty, student
where student.id = faculty.id