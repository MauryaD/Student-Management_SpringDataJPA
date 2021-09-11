package com.example.StudentManagement.repository;

import com.example.StudentManagement.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    @Query(nativeQuery = true, value = "DELETE FROM Student WHERE guardian_name is null")
    public void deleteStudent();

}
