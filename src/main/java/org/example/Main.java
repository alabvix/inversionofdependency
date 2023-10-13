package org.example;

import org.example.employee.Employee;
import org.example.employee.EmployeeFactory;
import org.example.employee.EmployeeSalaryService;

import java.math.BigDecimal;

public class Main {

    /**
     * Dependency Inversion
     * 
     * The main class represents the 'high level'. The Employee service is the 'low level'.
     * @param args
     */
    public static void main(String[] args) {

        final Employee employee = new Employee(1, "Jose", new BigDecimal("95.80"), 135);
        final EmployeeSalaryService salaryCalculator = EmployeeFactory.createSalaryCalculator();

        System.out.println(salaryCalculator.calculateSalary(employee));
    }
}