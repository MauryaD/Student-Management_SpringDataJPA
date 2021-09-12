package com.example.StudentManagement.repository;

import com.example.StudentManagement.entity.Course;
import com.example.StudentManagement.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TeacherRepositoryTest {

    @Autowired
    private TeacherRepository teacherRepository;

    @Test
    public void saveTeacher(){
        Course courseSpringBoot = Course.builder()
                .title("SpringBoot")
                .credit(5)
                .build();
        Course courseJava = Course.builder()
                .title("Java")
                .credit(5)
                .build();
        Teacher teacher = Teacher.builder()
                .firstName("Brahma")
                .lastName("Aarav")
                .courses(List.of(courseSpringBoot, courseJava)).build();

        teacherRepository.save(teacher);
    }
}