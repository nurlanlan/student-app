package az.edu.turing.studentappmaven.controller;

import az.edu.turing.studentappmaven.domain.entity.StudentEntity;
import az.edu.turing.studentappmaven.service.impl.StudentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/students")
public class StudentController {

    private final StudentService studentService;

    @GetMapping
    public List<StudentEntity> getStudents() {
        log.info("GET -> /api/v1/students");
        return studentService.findAll();
    }

    @GetMapping("/{id}")
    public StudentEntity getStudentById(@PathVariable Long id) {
        log.info("GET -> /api/v1/students/{}", id);
        return studentService.findById(id);
    }

    @PostMapping
    public StudentEntity createStudent(@RequestBody StudentEntity student) {
        return studentService.save(student);
    }
}