package ru.hogwarts.school.service;

import org.springframework.stereotype.Service;
import ru.hogwarts.school.model.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class StudentService {
    private HashMap<Long, Student> studentList = new HashMap<>();
    private long lastId = 0;

    public Student createStudent(Student student) {
        student.setId(++lastId);
        studentList.put(lastId, student);
        return student;
    }

    public Student findStudent(long id) {
        return studentList.get(id);
    }

    public Student editStudent(Student student) {
        studentList.put(student.getId(), student);
        return student;
    }

    public Student geleteStudent(long id) {
        return studentList.remove(id);
    }

    public List<Student> getStudentsByAge(long id) {
        List<Student> listStudentsByAge = new ArrayList<>();
        if (id >= 0 || id < studentList.size()) {
            for (int i = 0; i < studentList.size(); i++) {
                if (studentList.get(id).getAge() == id) {
                    listStudentsByAge.add(studentList.get(id));
                }
            }
            return listStudentsByAge;
        }
        return null;
    }
}
