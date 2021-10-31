package com.example.pals.services.implement;

import com.example.pals.dtos.responseDTOs.EmployeeResponseDTO;
import com.example.pals.entities.Employee;
import com.example.pals.repositories.EmployeesRepository;
import com.example.pals.services.EmployeesServices;
import com.example.pals.services.mappers.EmployeesMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class EmployeesImplement implements EmployeesServices {
    private final EmployeesRepository employeesRepository;
    @Override
    public List<EmployeeResponseDTO> findByFirstname(String firstName) {
        return EmployeesMapper.INSTANCE.mapToEmployeeResponseDTOs(employeesRepository.findByfirstName(firstName));
    }

    @Override
    public List<EmployeeResponseDTO> getAllEmployees() {
        return EmployeesMapper.INSTANCE.mapToEmployeeResponseDTOs(employeesRepository.findAll());
    }
}
