package az.edu.turing.studentappmaven.domain.repository;

import az.edu.turing.studentappmaven.domain.entity.StudentEntity;
import java.util.List;
import java.util.Optional;

public interface StudentRepository {

    StudentEntity save(StudentEntity student);

    List<StudentEntity> findAll();

    Optional<StudentEntity> findById(Long id);

    void deleteById(Long id);
}