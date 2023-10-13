package org.example.employee;

public interface EmployeeFactory {
    static EmployeeSalaryService createSalaryCalculator(){
        return new EmployeeSalaryCalculator();
    };
}
