package ru.hogwarts.school.controller;


import org.springframework.web.bind.annotation.*;
import ru.hogwarts.school.model.Faculty;
import ru.hogwarts.school.model.Student;
import ru.hogwarts.school.service.FacultyService;

import java.util.List;

@RestController
@RequestMapping("Faculty")
public class FacultyController {
    private final FacultyService facultyService;

    public FacultyController(FacultyService facultyService) {
        this.facultyService = facultyService;
    }

    @GetMapping("{id}")
    public Faculty getFacultyForId(@PathVariable long id) {
        return facultyService.findFaculty(id);
    }

    @PostMapping()
    public Faculty createFaculty(@RequestBody Faculty faculty) {
        return facultyService.createFaculty(faculty);
    }

    @PutMapping()
    public Faculty editFaculty(@RequestBody Faculty faculty) {
        return facultyService.editFaculty(faculty);
    }

    @DeleteMapping("{id}")
    public Faculty deleteFaculty(@PathVariable long id) {
        return facultyService.deleteFaculty(id);
    }

    @GetMapping("{color}")
    public List<Faculty> getFacultyByColor(@PathVariable String color) {
        return facultyService.getFacultysByColor(color);
    }
}
