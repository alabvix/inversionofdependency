package org.example.employee;

import java.math.BigDecimal;

public record Employee(
        Integer id,
        String name,
        BigDecimal salaryPerHour,
        Integer workedHours
) {}
