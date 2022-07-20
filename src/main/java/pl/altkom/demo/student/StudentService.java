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


    public void delete(Long id) {
        if (!studentRepository.existsById(id)) {
            throw new IllegalStateException("Student o takim id nie istnieje!");
        }
        studentRepository.deleteById(id);
    }

    public void update(Long id, String name, String email) {
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException("Student o podanym id nie istnieje"));

        if (name != null && name.length() > 0 && !name.equals(student.getName())) {
            student.setName(name);
        }

        if (email != null && email.length() > 0 && !email.equals(student.getEmail())) {
            student.setEmail(email);
        }

        studentRepository.save(student);

    }

    public Student getById(Long id) {
        return studentRepository.findById(id).orElseThrow(IllegalStateException::new);
    }
}
