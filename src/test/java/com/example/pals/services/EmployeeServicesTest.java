package com.example.pals.services;

import com.example.pals.repositories.StudentsRepository;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

@SpringBootTest
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
public class EmployeeServicesTest {
    @Autowired
    private EmployeesServices employeesServices;
    @Autowired
    private StudentsRepository studentsRepository;
    @Test
    public void whenFindEmployeeByFullnameReturnExactEmployee(){
        System.out.println(employeesServices.getAllEmployees());
    }
    @Test
    public void getAllEmployees(){
        System.out.println(studentsRepository.findAll());
    }
}
