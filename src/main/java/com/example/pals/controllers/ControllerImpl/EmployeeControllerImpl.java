package com.example.pals.controllers.ControllerImpl;

import com.example.pals.controllers.EmployeesController;
import com.example.pals.dtos.requestDTOs.EmployeeRequestDTO;
import com.example.pals.dtos.responseDTOs.DeleteResponseMessage;
import com.example.pals.dtos.responseDTOs.EmployeeResponseDTO;
import com.example.pals.services.EmployeesServices;
import com.example.pals.services.implement.EmployeesImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeControllerImpl implements EmployeesController {
    @Autowired
    EmployeesServices employeesServices;
    @Override
    public ResponseEntity<List<EmployeeResponseDTO>> getAllEmployees() {
        return new ResponseEntity<>(employeesServices.getAllEmployees(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<EmployeeResponseDTO>> createEmployee(EmployeeRequestDTO employeeRequestDTO) {
        return null;
    }

    @Override
    public ResponseEntity<EmployeeResponseDTO> updateEmployee(long id, EmployeeRequestDTO employee) {
        return null;
    }

    @Override
    public ResponseEntity<DeleteResponseMessage> deleteEmployee(long id) {
        return null;
    }
}
