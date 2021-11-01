package com.example.pals.services.implement;

import com.example.pals.dtos.requestDTOs.StudentRequestDTO;
import com.example.pals.dtos.responseDTOs.StudentResponseDTO;
import com.example.pals.entities.Student;
import com.example.pals.repositories.StudentsRepository;
import com.example.pals.services.StudentServices;
import com.example.pals.services.mappers.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionSystemException;
import org.zalando.problem.Problem;
import org.zalando.problem.Status;

import javax.validation.ConstraintViolationException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service

public class StudentServicesImpl implements StudentServices {
    @Autowired
    StudentsRepository studentsRepository;
    @Override
    public List<StudentResponseDTO> getAllStudents() {
        return StudentMapper.INSTANCE.mapStudentToStudentResponseDTOs(studentsRepository.findAll());
    }

    @Override
    public List<StudentResponseDTO> findStudentByfirstName(String firstName) {
        return StudentMapper.INSTANCE.mapStudentToStudentResponseDTOs(studentsRepository.findByfirstName(firstName));
    }

    @Override
    public StudentResponseDTO findStudentById(Long id) {
        return StudentMapper.INSTANCE.mapStudentToStudentResponseDTO(studentsRepository.getById(id));
    }

    @Override
    public StudentResponseDTO createNewStudent(StudentRequestDTO studentRequestDTO) {
        Student student = null;
        try {
            student = StudentMapper.INSTANCE.mapStudentRequestDTotoStudent(studentRequestDTO);
            studentsRepository.save(student);
        }
        catch (ConstraintViolationException e) {
            String detail = e.getConstraintViolations().stream().map(s -> s.getMessage()).collect(Collectors.joining(", "));
            throw Problem.builder().withStatus(Status.BAD_REQUEST).withDetail(detail).withTitle("parameter error").build();
        }
        return StudentMapper.INSTANCE.mapStudentToStudentResponseDTO(student);
    }

    @Override
    public StudentResponseDTO updateStudent(StudentRequestDTO studentRequestDTO) {
        Optional<Student> studentCheck = Optional.of(studentsRepository.getById(studentRequestDTO.getId()));
        if (!studentCheck.isPresent()){
            throw Problem.valueOf(Status.BAD_REQUEST, "Student is not existed");
        }
        Student student = null;
        try {
            StudentMapper.INSTANCE.updateModel(studentRequestDTO, student);
            studentsRepository.save(student);
        }
        catch (TransactionSystemException e){
            Throwable t = e.getCause();
            while ((t != null) && !(t instanceof ConstraintViolationException))
            {
                t=t.getCause();
            }
            if (t instanceof ConstraintViolationException){
                String detail = ((ConstraintViolationException) t).getConstraintViolations()
                        .stream().map(c->c.getMessage())
                        .collect(Collectors.joining(", "));
                throw Problem.builder().withStatus(Status.BAD_REQUEST).withDetail(detail)
                        .withTitle("Parameter error")
                        .build();
            }
        }
        return StudentMapper.INSTANCE.mapStudentToStudentResponseDTO(student);
    }

    @Override
    public String deleteStudent(Long id) {
        Optional<Student> student = studentsRepository.findById(id);
        if (student.isPresent())
        {
            try {
                studentsRepository.deleteById(id);
            }
            catch (Exception e){
                throw Problem.valueOf(Status.BAD_REQUEST,
                        "Cannot delete student. You have to delete the student's extra activities first.");
            }
        }
        else return "Cannot find student with id "+id+".";
        return "Deleted";
    }
}
