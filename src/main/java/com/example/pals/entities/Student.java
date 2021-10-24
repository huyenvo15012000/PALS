package com.example.pals.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    @NotNull
    @Column
    String firstName;

    @NotNull
    @Column
    String lastName;

    @NotNull
    @Column
    Date DOB;

    @NotNull
    @Column
    String phoneNumber;

    @NotNull
    @Column
    String emailAddress;

    @NotNull
    @Column
    String address;

    @NotNull
    @Column
    Date dayJoin;

    @NotNull
    @Column
    Date dayLeave;
    String motherName;
    String fatherName;
}
