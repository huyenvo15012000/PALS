package com.example.pals.services;

import com.example.pals.dtos.responseDTOs.EmployeeResponseDTO;
import com.example.pals.entities.Employee;

import java.util.List;

public interface EmployeesServices {
    List<EmployeeResponseDTO> findByFirstname(String firstName);
    List<EmployeeResponseDTO> getAllEmployees();
}
