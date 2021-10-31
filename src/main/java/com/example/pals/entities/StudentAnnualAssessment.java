package com.example.pals.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentAnnualAssessment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToOne
    @JoinColumn(name = "studentId")
    Student student;

    @NotNull
    float GPA;

    @NotNull
    String major;

    @ManyToOne
    @JoinColumn(name = "programId")
    Program program;

    @NotNull
    Integer year;

    @NotNull
    Integer povertyAssessment;
}
