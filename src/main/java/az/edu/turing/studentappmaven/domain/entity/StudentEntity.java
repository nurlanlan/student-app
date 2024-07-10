package az.edu.turing.studentappmaven.domain.entity;


import lombok.Data;

import javax.annotation.PostConstruct;
import java.time.LocalDate;

@Data
@PostConstruct
public class StudentEntity {
    public Long id;
    public String name;
    public Integer age;
    public Boolean gender;
    public Double grade;
    public LocalDate updateDate;
    public LocalDate deleteDate;

}
