package com.example.pals.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Date;
import java.sql.Time;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExtraActivity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "programId")
    Program belongingProgram;

    @ManyToOne
    @JoinColumn(name = "tutorId")
    Tutor tutor;

    String topic;

    @NotNull
    Date date;

    @NotNull
    Time startTime;

    @NotNull
    Time endTime;
}
