package org.example.employee;

import java.math.BigDecimal;

/**
 * <pre>
 * Essa é uma abstração que define as regras de negócio para o cálculo de salário. Todas as classes que precisam
 * calcalar o salário devemdepender dessa interace.
 *
 * This is the abstraction that defines the business rules for calculating salaries.
 * All classes that need to perform salary calculations should depend on this.
 * </pre>
 */
public interface EmployeeSalaryService {
    BigDecimal calculateSalary(Employee employee);
}
