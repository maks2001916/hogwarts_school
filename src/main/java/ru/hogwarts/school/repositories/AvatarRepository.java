package ru.hogwarts.school.repositories;

import org.springframework.web.multipart.MultipartFile;
import ru.hogwarts.school.model.Avatar;

import java.util.Optional;

public interface AvatarRepository {
    Optional<Avatar> findByStudentId(Long studentId);
}
