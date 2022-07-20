package pl.altkom.demo.student;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/student")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getStudentList() {
        return studentService.getStudentList();
    }

    @PostMapping
    public void addStudent(@RequestBody Student student) {
        System.out.println(student);
        studentService.addStudent(student);
    }

}
