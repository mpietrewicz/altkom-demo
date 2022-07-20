package pl.altkom.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudentList() {
        Student studentAnna = new Student(LocalDate.parse("1999-01-01"), "Anna", "anna@gmail.com", 23);
        Student studentJan = new Student(LocalDate.parse("1991-09-22"), "Jan", "Jan@gmail.com", 31);
        return List.of(studentAnna, studentJan);
    }

}
