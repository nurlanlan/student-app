package az.edu.turing.studentappmaven.service.impl;

import az.edu.turing.studentappmaven.domain.entity.StudentEntity;

import java.util.List;

public interface StudentService {

    StudentEntity save(StudentEntity student);

    List<StudentEntity> findAll();

    StudentEntity findById(Long id);

    void deleteById(Long id);
}


