package com.example.StudentManagement.repository;

import com.example.StudentManagement.entity.Guardian;
import com.example.StudentManagement.entity.Student;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
//@DataJpaTest this is used to test and flush data.
class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void saveStudent(){
        Student student = Student.builder()
                .emailId("lazycoder@gmail.com")
                .firstName("Lazy")
                .lastName("Coder")
                .build();

        studentRepository.save(student);
    }

    @Test
    public void saveStudentWithGuardian(){

        Guardian guardian = Guardian.builder()
                .email("dev@gmail.com")
                .name("Dev")
                .mobile("987456321")
                .build();

        Student student = Student.builder()
                .emailId("adi@gmail.com")
                .firstName("Aadi")
                .lastName("Dev")
                .guardian(guardian)
                .build();

        studentRepository.save(student);

    }

    @Test
    public void getStudentsList(){
        List<Student> studentList = studentRepository.findAll();

        System.out.println("Students' List: " + studentList);

    }

    @Test
    public void deleteStudent(){
        studentRepository.deleteStudent();
        getStudentsList();
    }

}