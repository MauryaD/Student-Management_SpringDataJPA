package com.example.StudentManagement.repository;

import com.example.StudentManagement.entity.Course;
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

}