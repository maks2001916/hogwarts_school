package ru.hogwarts.school.service;

import org.springframework.stereotype.Service;
import ru.hogwarts.school.model.Faculty;
import ru.hogwarts.school.model.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class FacultyService {
    private HashMap<Long, Faculty> facultsList = new HashMap<>();
    private long lastId = 0;

    public Faculty createFaculty(Faculty faculty) {
        faculty.setId(++lastId);
        facultsList.put(lastId, faculty);
        return faculty;
    }

    public Faculty findFaculty(long id) {
        return facultsList.get(id);
    }

    public Faculty editFaculty(Faculty faculty) {
        facultsList.put(faculty.getId(), faculty);
        return faculty;
    }

    public Faculty deleteFaculty(long id) {
        return facultsList.remove(id);
    }

    public List<Faculty> getFacultysByColor(String color) {
        List<Faculty> listFacultyByColor = new ArrayList<>();
        if (color != null) {
            for (int i = 0; i < facultsList.size(); i++) {
                if (facultsList.get(i).getColor().equals(color)) {
                    listFacultyByColor.add(facultsList.get(i));
                }
            }
            return listFacultyByColor;
        }
        return null;
    }
}
