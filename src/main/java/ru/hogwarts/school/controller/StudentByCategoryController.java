package ru.hogwarts.school.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.hogwarts.school.model.StudentByCategory;
import ru.hogwarts.school.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentByCategoryController {

    private final StudentService studentService;


    public StudentByCategoryController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/student-by-categories")
    public List<StudentByCategory> getStudentByCategories() {
        return studentService.getStudentByCategory();
    }

    @GetMapping("/avg-age-student-by-categories")
    public List<StudentByCategory> getAvgAgeStudentByCategories() {
        return studentService.getAvgAgeStudentByCategory();
    }

    @GetMapping("/last-five-student-by-categories")
    public List<StudentByCategory> getLastFiveStudentByCategories() {
        return studentService.gatLastFiveStudentByCategory();
    }

}
