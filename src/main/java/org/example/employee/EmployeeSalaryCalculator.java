package org.example.employee;

import java.math.BigDecimal;

/**
 * <pre>
 * Esta classe implementa as regras de negócio para calcular o salário. Ela não é pública para impedir
 * que seja diretamente instanciada, assim violando o princípio de Inversão de Depêndencia.
 *
 * This class is the concrete implementation of the salary calculation business rules.
 * It is not made public to prevent its use outside the salary package,
 * which could violate the Dependency Inversion Principle.
 * </pre>
 */
class EmployeeSalaryCalculator implements EmployeeSalaryService {
    @Override
    public BigDecimal calculateSalary(Employee employee) {
        return employee.salaryPerHour().multiply(
                new BigDecimal(employee.workedHours())
        );
    }
}
