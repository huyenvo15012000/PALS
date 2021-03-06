package com.example.pals.dtos.requestDTOs;

import com.example.pals.entities.enums.Gender;
import com.example.pals.entities.enums.Position;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmployeeRequestDTO {
    String firstName;
    String lastName;
    Date DOB;
    String phoneNumber;
    String emailAddress;
    String address;
    Date dayJoin;
    Date dayLeave;
    Long salary;
    Position position;
    Gender gender;
}
