package com.example.pals.services.mappers;

import com.example.pals.dtos.requestDTOs.StudentRequestDTO;
import com.example.pals.dtos.responseDTOs.StudentResponseDTO;
import com.example.pals.entities.Student;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface StudentMapper {
    StudentMapper INSTANCE = Mappers.getMapper(StudentMapper.class);

    Student mapStudentRequestDTotoStudent(StudentRequestDTO studentRequestDTO);

    @Mapping(target = "id", ignore = true)
    void updateModel(StudentRequestDTO studentRequestDTO, @MappingTarget Student student);
    StudentResponseDTO mapStudentToStudentResponseDTO(Student student);
    List<StudentResponseDTO> mapStudentToStudentResponseDTOs(List<Student> students);
}
