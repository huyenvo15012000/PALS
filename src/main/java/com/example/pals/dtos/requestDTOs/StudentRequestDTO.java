package com.example.pals.dtos.requestDTOs;

import com.example.pals.entities.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Optional;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StudentRequestDTO {
    Long id;
    String firstName;
    String lastName;
    Date DOB;
    String phoneNumber;
    String emailAddress;
    Gender gender;
}
