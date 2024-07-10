package az.edu.turing.studentappmaven.domain.repository;

import az.edu.turing.studentappmaven.domain.entity.StudentEntity;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;
import java.util.List;

@Repository
public class InMemoryStudentRepository implements StudentRepository {

    public static List<StudentEntity> STUDENTS;
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    @PostConstruct
    public void init() {
        STUDENTS = List.of(
                new StudentEntity(1L, "Selen", 19,85.1,false, LocalDateTime.parse("22/02/2023 00:00", dateTimeFormatter),LocalDateTime.now()),
                new StudentEntity(2L, "Leyla", 25,51.2,false, LocalDateTime.parse("22/02/2023 00:00", dateTimeFormatter),LocalDateTime.now()),
                new StudentEntity(3L, "Beshir", 20,99.9,false, LocalDateTime.parse("22/02/2023 00:00", dateTimeFormatter),LocalDateTime.now()),
                new StudentEntity(4L, "Ferid", 23,78.9,false, LocalDateTime.parse("22/02/2023 00:00", dateTimeFormatter),LocalDateTime.now()),
                new StudentEntity(5L, "Heybat", 19,89.1,false, LocalDateTime.parse("22/02/2023 00:00", dateTimeFormatter),LocalDateTime.now())

        );
    }

    @Override
    public StudentEntity save(StudentEntity student) {
        return null;
    }

    @Override
    public List<StudentEntity> findAll() {
        return STUDENTS;
    }

    @Override
    public Optional<StudentEntity> findById(Long id) {
        return STUDENTS.stream().filter(studentEntity -> studentEntity.getId().equals(id)).findFirst();
    }

    @Override
    public void deleteById(Long id) {

    }
}