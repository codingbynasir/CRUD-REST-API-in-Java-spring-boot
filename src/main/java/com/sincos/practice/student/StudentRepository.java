package com.sincos.practice.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    //Query to get a specific student using email
//    @Query("SELECT s FROM Student s WHERE s.email=?1")
    //it will find student by email
    Optional<Student> findStudentByEmail(String email);
}
