package az.edu.turing.studentappmaven.domain.entity;


import lombok.*;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Log4j2
public class StudentEntity {

    private Long id;
    private String name;
    private Integer age;
    private Double grade;
    private Boolean gender;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}