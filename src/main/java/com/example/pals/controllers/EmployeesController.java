package com.example.pals.controllers;

import com.example.pals.dtos.requestDTOs.EmployeeRequestDTO;
import com.example.pals.dtos.responseDTOs.DeleteResponseMessage;
import com.example.pals.dtos.responseDTOs.EmployeeResponseDTO;
import com.example.pals.entities.Employee;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(path = "/employees")
public interface EmployeesController {
    @GetMapping
    ResponseEntity<List<EmployeeResponseDTO>> getAllEmployees();

    @PostMapping(path = "/createnewemployee")
    ResponseEntity<List<EmployeeResponseDTO>> createEmployee(@RequestBody EmployeeRequestDTO employeeRequestDTO);

    @PutMapping(path = "/employees/{id}")
    ResponseEntity<EmployeeResponseDTO> updateEmployee(@PathVariable ("id") long id,
                                                              @RequestBody EmployeeRequestDTO employee);

    @DeleteMapping(path = "/employee/{id}")
    ResponseEntity<DeleteResponseMessage> deleteEmployee(@PathVariable ("id") long id);

}
