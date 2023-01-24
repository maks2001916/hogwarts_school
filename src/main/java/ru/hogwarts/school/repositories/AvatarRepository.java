package ru.hogwarts.school.repositories;

import org.springframework.web.multipart.MultipartFile;
import ru.hogwarts.school.model.Avatar;

public interface AvatarRepository {
    Avatar findAvatar(Long studentId, MultipartFile avatar);
}
