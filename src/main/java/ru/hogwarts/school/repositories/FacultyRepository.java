package ru.hogwarts.school.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.hogwarts.school.model.Faculty;

import java.util.List;

public interface FacultyRepository extends JpaRepository<Faculty, Long> {
    Faculty findByNameIgnoreCaseOrColorIgnoreCase(String name, String color);

    List<Faculty> getFacultiesByColorAndName(String color, String name);
}
