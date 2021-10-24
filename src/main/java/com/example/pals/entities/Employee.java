package com.example.pals.entities;

import com.example.pals.entities.enums.Position;
import lombok.*;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
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
    Long salary;
    @Enumerated(EnumType.STRING)
    Position position;
}
