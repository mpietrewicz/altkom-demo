package pl.altkom.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfiguration {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student studentAnna = new Student(LocalDate.parse("1999-01-01"), "Anna", "anna@gmail.com", 23);
            Student studentJan = new Student(LocalDate.parse("1991-09-22"), "Jan", "Jan@gmail.com", 31);
            studentRepository.saveAll(List.of(studentAnna, studentJan));
        };
    }


}
