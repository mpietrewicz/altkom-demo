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

    @GetMapping(path = "{id}")
    public Student getStudent(@PathVariable("id") Long id) {
        Student student = studentService.getById(id);
        return student;
    }


    @PostMapping
    public void addStudent(@RequestBody Student student) {
        studentService.addStudent(student);
    }

    @DeleteMapping(path = "{studentId}")
    public void deleteStudent(@PathVariable("studentId") Long id) {
        studentService.delete(id);
    }

    @PutMapping(path = "{studentId}")
    public void updateStudent(@PathVariable("studentId") Long id, @RequestParam(required = false) String name,
                              @RequestParam(required = false) String email) {
        System.out.println(id + ", " + name + ", " +email);
        studentService.update(id, name, email);
    }

}
