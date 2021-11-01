package com.example.pals.repositories;

import com.example.pals.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentsRepository extends JpaRepository<Student, Long> {
    List<Student> findByfirstName(String firstName);
}
