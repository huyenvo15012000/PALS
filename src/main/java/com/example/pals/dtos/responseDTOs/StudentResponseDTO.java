package com.example.pals.dtos.responseDTOs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StudentResponseDTO {
    Long id;
    String firstName;
    String lastName;
    Date DOB;
    String phoneNumber;
    String emailAddress;
}
