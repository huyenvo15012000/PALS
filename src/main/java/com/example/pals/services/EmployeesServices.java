package com.example.pals.services;

import com.example.pals.dtos.requestDTOs.EmployeeRequestDTO;
import com.example.pals.dtos.responseDTOs.DeleteResponseMessage;
import com.example.pals.dtos.responseDTOs.EmployeeResponseDTO;
import com.example.pals.entities.Employee;

import java.util.List;

public interface EmployeesServices {
    List<EmployeeResponseDTO> getAllEmployees();
    List<EmployeeResponseDTO> findByFirstname(String firstName);
    EmployeeResponseDTO findById(Long id);
    EmployeeResponseDTO createNewEmployee(EmployeeRequestDTO employeeRequestDTO);
    EmployeeResponseDTO updateEmployeeById(EmployeeRequestDTO employeeRequestDTO);
    DeleteResponseMessage deleteEmployeeById(Long id);
}
