package com.cognizant.ormlearn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cognizant.ormlearn.model.Employee;
import com.cognizant.ormlearn.service.EmployeeService;

@SpringBootApplication
public class SpringDataJpaApplication implements CommandLineRunner {

    @Autowired
    private EmployeeService employeeService;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaApplication.class, args);
    }

    @Override
    public void run(String... args) {
        Employee emp = new Employee();
        emp.setName("Jane Doe");
        emp.setDepartment("IT");

        employeeService.addEmployee(emp);
        System.out.println("Employee added with Spring Data JPA");
    }
}
