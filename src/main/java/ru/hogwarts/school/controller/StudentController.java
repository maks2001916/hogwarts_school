package ru.hogwarts.school.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import ru.hogwarts.school.model.Avatar;
import ru.hogwarts.school.model.Faculty;
import ru.hogwarts.school.model.Student;
import ru.hogwarts.school.model.StudentByCategory;
import ru.hogwarts.school.service.StudentService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
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
        return studentService.getLastFiveStudentByCategory();
    }
    @GetMapping("/{id}")
    public Student getStudentForId(@PathVariable long id) {
        return studentService.findStudent(id);
    }

    @GetMapping
    public Student findStudentByAge(@RequestParam Long ageAfter,
                                    @RequestParam Long ageBefore) {
        return studentService.findStudentByAge(ageAfter, ageBefore);
    }

    @GetMapping("/faculty/{studentId}")
    public ResponseEntity<Faculty> findFacultyOfStudent(@PathVariable Long studentId) {
        return ResponseEntity.ok(studentService.findStudent(studentId).getFaculty());
    }

    @PostMapping()
    public Student createStudent(@RequestBody Student student) {

        return studentService.createStudent(student);
    }

    @PutMapping()
    public Student editStudent(@RequestBody Student student) {
        return studentService.editStudent(student);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteStudent(@PathVariable long id) {
        studentService.deleteStudent(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/students/name/{name}")
    public ResponseEntity<List<Student>> getStudentByName(@PathVariable("name") String name) {
        List<Student> students = studentService.getStudentByName(name);
        return ResponseEntity.ok(students);
    }

}
