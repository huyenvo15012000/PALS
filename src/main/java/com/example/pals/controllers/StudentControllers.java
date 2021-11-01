package com.example.pals.controllers;

import com.example.pals.dtos.requestDTOs.EmployeeRequestDTO;
import com.example.pals.dtos.requestDTOs.StudentRequestDTO;
import com.example.pals.dtos.responseDTOs.DeleteResponseMessage;
import com.example.pals.dtos.responseDTOs.EmployeeResponseDTO;
import com.example.pals.dtos.responseDTOs.StudentResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(path = "/students")
public interface StudentControllers {
    @GetMapping
    ResponseEntity<List<StudentResponseDTO>> getAllStudents();

    @GetMapping(path = "/{id}")
    ResponseEntity<StudentResponseDTO> findStudentById(@PathVariable ("id") Long id);

    @GetMapping(path = "/name/{firstName}")
    ResponseEntity<List<StudentResponseDTO>> findStudentByfirstName(@PathVariable ("firstName") String firstName);

    @PostMapping(path = "/createStudent")
    ResponseEntity<StudentResponseDTO> createStudent(@RequestBody StudentRequestDTO studentRequestDTO);

    @PutMapping(path = "/updateStudent")
    ResponseEntity<StudentResponseDTO> updateStudent(@RequestBody StudentRequestDTO student);

    @DeleteMapping(path = "/deleteStudent/{id}")
    ResponseEntity<DeleteResponseMessage> deleteStudent(@PathVariable ("id") long id);
}
