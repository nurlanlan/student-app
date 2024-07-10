package az.edu.turing.studentappmaven.service.impl.impl;

import az.edu.turing.studentappmaven.domain.entity.StudentEntity;
import az.edu.turing.studentappmaven.domain.repository.StudentRepository;
import az.edu.turing.studentappmaven.service.impl.StudentService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Override
    public StudentEntity save(StudentEntity student) {
        throw new IllegalStateException("not implemented yet...");
    }

    @Override
    public List<StudentEntity> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public StudentEntity findById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Long id) {

    }
}

