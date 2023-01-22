package ru.hogwarts.school.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.hogwarts.school.model.Faculty;
import ru.hogwarts.school.model.Student;
import ru.hogwarts.school.service.FacultyService;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/faculty")
public class FacultyController {
    private final FacultyService facultyService;

    public FacultyController(FacultyService facultyService) {
        this.facultyService = facultyService;
    }

    @GetMapping("/{id}")
    public Faculty getFacultyForId(@PathVariable long id) {
        return facultyService.findFaculty(id);
    }

    @GetMapping
    public Faculty getFacultyByNameOrColor(@RequestParam(required = false) String name,
                                          @RequestParam(required = false) String color) {
        return facultyService.findFacultyByNameOrColor(name, color);
    }

    @GetMapping("/students/{facultyId}")
    public ResponseEntity<Collection<Student>> getStudentsForFaculty(@PathVariable Long facultyId) {
        return ResponseEntity.ok(facultyService.findFaculty(facultyId).getStudents());
    }

    @PostMapping()
    public Faculty createFaculty(@RequestBody Faculty faculty) {

        return facultyService.createFaculty(faculty);
    }

    @PutMapping()
    public Faculty editFaculty(@RequestBody Faculty faculty) {
        return facultyService.editFaculty(faculty);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteFaculty(@PathVariable long id) {
        facultyService.deleteFaculty(id);
        return ResponseEntity.ok().build();
    }

}
