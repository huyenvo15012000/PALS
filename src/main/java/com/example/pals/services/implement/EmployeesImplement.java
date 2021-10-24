package com.example.pals.services.implement;

import com.example.pals.entities.Employee;
import com.example.pals.repositories.EmployeesRepository;
import com.example.pals.services.EmployeesServices;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class EmployeesImplement implements EmployeesServices {
    private final EmployeesRepository employeesRepository;
    @Override
    public List<Employee> findByFirstname(String firstName) {
        return employeesRepository.findByfirstName(firstName);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeesRepository.findAll();
    }
}
