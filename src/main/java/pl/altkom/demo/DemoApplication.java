package pl.altkom.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.altkom.demo.student.Student;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping
	public List<Student> getStudent() {
		Student studentAnna = new Student(LocalDate.parse("1999-01-01"), "Anna", "anna@gmail.com", 23);
		Student studentJan = new Student(LocalDate.parse("1991-09-22"), "Jan", "Jan@gmail.com", 31);
		return List.of(studentAnna, studentJan);
	}

}
