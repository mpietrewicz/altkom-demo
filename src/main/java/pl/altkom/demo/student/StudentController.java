package pl.altkom.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "api/student")
public class StudentController {

    @GetMapping
    public List<Student> getStudentList() {
        Student studentAnna = new Student(LocalDate.parse("1999-01-01"), "Anna", "anna@gmail.com", 23);
        Student studentJan = new Student(LocalDate.parse("1991-09-22"), "Jan", "Jan@gmail.com", 31);
        return List.of(studentAnna, studentJan);
    }

}
