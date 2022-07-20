package pl.altkom.demo.student;

import java.time.LocalDate;

public class Student {

    private Long id;
    private LocalDate dob;
    private String name;
    private String email;
    private Integer age;

    public Student(Long id, LocalDate dob, String name, String email, Integer age) {
        this.id = id;
        this.dob = dob;
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public Student(LocalDate dob, String name, String email, Integer age) {
        this.dob = dob;
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public Student() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", dob=" + dob +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}