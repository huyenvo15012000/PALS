package com.example.pals.controllers.ControllerImpl;

import com.example.pals.controllers.StudentControllers;
import com.example.pals.dtos.requestDTOs.StudentRequestDTO;
import com.example.pals.dtos.responseDTOs.DeleteResponseMessage;
import com.example.pals.dtos.responseDTOs.EmployeeResponseDTO;
import com.example.pals.dtos.responseDTOs.StudentResponseDTO;
import com.example.pals.entities.Student;
import com.example.pals.services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentControllersIplm implements StudentControllers {
    @Autowired
    StudentServices studentServices;
    @Override
    public ResponseEntity<List<StudentResponseDTO>> getAllStudents() {
        return new ResponseEntity<>(studentServices.getAllStudents(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<StudentResponseDTO> findStudentById(Long id) {
        return new ResponseEntity<>(studentServices.findStudentById(id), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<StudentResponseDTO>> findStudentByfirstName(String firstName) {
        return new ResponseEntity<>(studentServices.findStudentByfirstName(firstName), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<StudentResponseDTO> createStudent(StudentRequestDTO studentRequestDTO) {
        return new ResponseEntity<>(studentServices.createNewStudent(studentRequestDTO), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<StudentResponseDTO> updateStudent(StudentRequestDTO student) {
        return new ResponseEntity<>(studentServices.updateStudent(student), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<DeleteResponseMessage> deleteStudent(long id) {
        return new ResponseEntity<>(new DeleteResponseMessage(studentServices.deleteStudent(id)), HttpStatus.OK);
    }
}
