package com.example.pals.services.mappers;
import com.example.pals.dtos.responseDTOs.EmployeeResponseDTO;
import com.example.pals.entities.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface EmployeesMapper {
    EmployeesMapper INSTANCE = Mappers.getMapper(EmployeesMapper.class);

    EmployeeResponseDTO mapToEmployeeResponseDTO(Employee employee);
    List<EmployeeResponseDTO> mapToEmployeeResponseDTOs(List<Employee> employees);

}
