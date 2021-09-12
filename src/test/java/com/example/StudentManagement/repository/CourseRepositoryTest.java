package com.example.StudentManagement.repository;

import com.example.StudentManagement.entity.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.SQLOutput;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourseRepositoryTest {

    @Autowired
    private CourseRepository courseRepository;

    @Test
    public void fetchAllCourses(){
        List<Course> courseList = courseRepository.findAll();

        System.out.println("All the courses: " + courseList);
    }

    @Test
    public void saveCourseWithTeacher(){
        Course course = Course.builder()
                .title("Python")
                .credit(4)
                .teacher(Teacher.builder()
                        .firstName("Aditya")
                        .lastName("Tandon").build())
                .build();

        courseRepository.save(course);
    }

    @Test
    public void saveCourseWithStudentAndTeacher(){
        Course course = Course.builder()
                .title("IoT")
                .credit(5)
                .teacher(Teacher.builder().firstName("James")
                        .lastName("Andrews").build())
                .students(List.of(Student.builder()
                        .firstName("Sophie")
                        .lastName("Williams")
                        .emailId("sophie123@xyz.com")
                        .guardian(Guardian.builder()
                                .name("Lucas Henry")
                                .email("lucashenry@demo.com")
                                .mobile("456977121").build())
                        .build()))
                .build();

        courseRepository.save(course);

    }

}