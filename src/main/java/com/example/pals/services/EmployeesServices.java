package com.example.pals.services;

import com.example.pals.entities.Employee;

import java.util.List;

public interface EmployeesServices {
    List<Employee> findByFirstname(String firstName);
    List<Employee> getAllEmployees();
}
