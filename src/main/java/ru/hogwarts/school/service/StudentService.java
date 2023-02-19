package ru.hogwarts.school.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import ru.hogwarts.school.model.Student;
import ru.hogwarts.school.model.StudentByCategory;
import ru.hogwarts.school.repositories.StudentRepository;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    private Logger logger = LoggerFactory.getLogger(StudentService.class);

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student createStudent(Student student) {
        logger.debug("method called createStudent");
        return studentRepository.save(student);
    }

    public Student findStudent(long id) {
        logger.debug("method called findStudent");
        return studentRepository.findById(id).get();
    }

    public Student editStudent(Student student) {
        logger.debug("method called editStudent");
        return studentRepository.save(student);
    }

    public void deleteStudent(long id) {
        logger.debug("method called deleteStudent");
        studentRepository.deleteById(id);
    }

    public Student findStudentByAge(Long ageAfter, Long ageBefore) {
        logger.debug("method called findStudentByAge");
        return studentRepository.findByAgeBetween(ageAfter, ageBefore);
    }

    private String getExtension(String fileName) {
        logger.debug("method called getExtensions");
        return fileName.substring(fileName.lastIndexOf(".") + 1);
    }

    public List<StudentByCategory> getStudentByCategory() {
        logger.debug("method called getStudentByCategory");
        return studentRepository.getStudentByCategory();
    }

    public List<StudentByCategory> getAvgAgeStudentByCategory() {
        logger.debug("method called getAvgAgeStudentByCategory");
        return studentRepository.getAvgAgeStudentByCategory();
    }

    public List<StudentByCategory> getLastFiveStudentByCategory() {
        logger.debug("method called getLastFiveStudentByCategory");
        return studentRepository.getLastFiveStudentByCategory();
    }

    public List<Student> getStudentByName(String name) {
        logger.debug("method called getStudentByName");
        return studentRepository.getStudentByName(name);
    }

    public List<Student> getStudentOnA(char variable) {
        logger.debug("method called getStudentOnA");
        List<Student> filteredStudents = studentRepository.findAll()
                .stream()
                .filter(s -> s.getName().toLowerCase().toUpperCase().startsWith("A"))
                .collect(Collectors.toList());
        return filteredStudents;
    }

    public int getExpression() {
        logger.debug("method called getExpression");
        int limit = 1_000_000;
        return IntStream
                .range(1, limit + 1)
                .sum();
    }

    public void getStudentNoParallel() {
        System.out.println(studentRepository.findAll().get(1));
        System.out.println(studentRepository.findAll().get(2));
        new Thread(() ->{
            System.out.println(studentRepository.findAll().get(2));
            System.out.println(studentRepository.findAll().get(3));
        }).start();

        new Thread(() ->{
            System.out.println(studentRepository.findAll().get(5));
            System.out.println(studentRepository.findAll().get(6));
        }).start();

    }

    public synchronized void getStudentParallel() {
            System.out.println(studentRepository.findAll().get(1));
            System.out.println(studentRepository.findAll().get(2));
        new Thread(() ->{
            System.out.println(studentRepository.findAll().get(3));
            System.out.println(studentRepository.findAll().get(4));
        }).start();
        new Thread(() ->{
            System.out.println(studentRepository.findAll().get(4));
            System.out.println(studentRepository.findAll().get(5));
        }).start();


    }

}
