package ru.hogwarts.school.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import ru.hogwarts.school.model.Faculty;
import ru.hogwarts.school.model.Student;
import ru.hogwarts.school.repositories.FacultyRepository;

import java.util.*;

@Service
public class FacultyService {

    private FacultyRepository facultyRepository;

    Logger logger = LoggerFactory.getLogger(FacultyService.class);

    public FacultyService(FacultyRepository facultyRepository) {
        this.facultyRepository = facultyRepository;
    }

    public Faculty createFaculty(Faculty faculty) {
        logger.debug("method called createFaculty");
        return facultyRepository.save(faculty);
    }

    public Faculty findFaculty(long id) {
        logger.debug("method called findFaculty");
        return facultyRepository.findById(id).get();
    }

    public Faculty editFaculty(Faculty faculty) {
        logger.debug("method called editFaculty");
        return facultyRepository.save(faculty);
    }

    public void deleteFaculty(long id) {
        logger.debug("method called deleteFaculty");
        facultyRepository.deleteById(id);
    }

    public Faculty findFacultyByNameOrColor(String name, String color) {
        logger.debug("method called findFacultyByNameOrColor");
        return facultyRepository.findByNameIgnoreCaseOrColorIgnoreCase(name, color);
    }

    public List<Faculty> getFacultyByColorAndName(String color, String name) {
        logger.debug("method called getFacultyByColorAndName");
        return facultyRepository.getFacultiesByColorAndName(color, name);
    }

    public String getLongestFacultyName() {
        return facultyRepository.findAll()
                .stream()
                .map(Faculty::getName)
                .max(Comparator.comparingInt(String::length))
                .orElse(null);
    }

}
