# Príncipio da Inversão de Dependência - DIP

<span style="font-size:15px;">
The Dependency Inversion Principle (DIP) advocates that in a software system, high-level modules should depend on abstractions rather than details and low-level modules.
</span>

### High-level modules
> They are classes and entry-level functions, which are easier to understand and do not have complex logic.

### Details/low-level
> These are classes that have more complex logic, business rules, and implementations.

### Why Dependency Inversion is Worth Using?
* Decoupling modules makes the code easy to maintain and test.
* It prevents breaks by keeping high-level components isolated.
* It improves code reusability.
* It makes it easier to extend the application's classes.

## Example Project
The project features a module for calculating an employee's salary.

![alt text](model-en.png)

To ensure the Dependency Inversion Principle (DIP), our high-level class (Main) should not include any reference to the low-level detail EmployeeSalaryCalculator. That's why the EmployeeSalaryService interface is used.

## Links
[DIP in the Wild](https://martinfowler.com/articles/dipInTheWild.html)

[SOLID](https://en.wikipedia.org/wiki/SOLID)
