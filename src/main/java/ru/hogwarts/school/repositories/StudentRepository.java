package ru.hogwarts.school.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.hogwarts.school.model.Student;
import ru.hogwarts.school.model.StudentByCategory;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    Student findByAgeBetween(Long ageAfter, Long ageBefore);

    @Query(value = "SELECT category, SUM(amount) as amount FROM expenses GROUP BY category", nativeQuery = true)
    List<StudentByCategory> getStudentByCategory();

    @Query(value = "SELECT age, AVG(age) as age FROM expenses GROUP BY age", nativeQuery = true)
    List<StudentByCategory> getAvgAgeStudentByCategory();

    @Query(value = "SELECT category, as amount FROM expenses GROUP BY category, OFFSET(LIMIT - 5)", nativeQuery = true)
    List<StudentByCategory> getLastFiveStudentByCategory();
}
