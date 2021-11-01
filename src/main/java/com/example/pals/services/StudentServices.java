package com.example.pals.services;

import com.example.pals.dtos.requestDTOs.StudentRequestDTO;
import com.example.pals.dtos.responseDTOs.StudentResponseDTO;

import java.util.List;

public interface StudentServices {
    List<StudentResponseDTO> getAllStudents();
    List<StudentResponseDTO> findStudentByfirstName(String firstName);
    StudentResponseDTO findStudentById(Long id);
    StudentResponseDTO createNewStudent(StudentRequestDTO studentRequestDTO);
    StudentResponseDTO updateStudent(StudentRequestDTO student);
    String deleteStudent(Long id);
}
