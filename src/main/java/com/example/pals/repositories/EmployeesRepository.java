package com.example.pals.repositories;

import com.example.pals.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeesRepository extends JpaRepository <Employee, Long> {
    List<Employee> findByfirstName(String firstName);
}
