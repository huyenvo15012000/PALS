package com.example.pals.dtos.responseDTOs;

import com.example.pals.entities.enums.Position;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmployeeResponseDTO {
    protected Long id;
    String firstName;
    String lastName;
    Date DOB;
    String phoneNumber;
    String emailAddress;
    Position position;
}
