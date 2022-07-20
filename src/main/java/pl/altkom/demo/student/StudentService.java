package pl.altkom.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudentList() {
        return studentRepository.findAll();
    }

    public void addStudent(Student student) {
        if (student.getEmail() == null) {
            throw new IllegalStateException("Brak adresu email!");
        }

        Optional<Student> email = studentRepository.findStudentByEmail(student.getEmail());
        if (email.isPresent()) {
            throw new IllegalStateException("Email jest już zapisany!");
        } else {
            studentRepository.save(student);
        }
    }
}
