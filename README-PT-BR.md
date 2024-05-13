# Príncipio da Inversão de Dependência - DIP

<span style="font-size:15px;">
O princípio DIP advoga que em um sistema de software módulos de alto nível devem depender de abstrações
ao invés dos detalhes, implementações de lógicas complexas e regras de negócio (baixo nível).
</span>

### Módulos de alto nível
> São as classes mais volatéis, ou seja, que mudam com mais regularidade. Contém as regras de negócio.

### Detalhes/baixo nível
> São as classes menos voláteis, ou seja, que mudam pouco. São o framework, drivers, classe de configuração.

### Benefícios
* Desacoplar módulos torna o código fácil de manter e testar.
* Isso evita quebras ao manter componentes de alto nível isolados.
* Melhora a reutilização de código.
* Torna mais fácil estender as classes da aplicação.

## Projeto de Exemplo
O projeto apresanta um módulo para calcular o salário de um empregado.

![alt text](model-pt.png)


Para garantir o DIP, nossa classe de alto nível (Main) não deve incluir nenhuma referência para o detalhe de baixo nível EmployeeSalaryCalculator, por isso é usada a Interface EmployeeSalaryService

## Links
[DIP in the Wild](https://martinfowler.com/articles/dipInTheWild.html)

[SOLID](https://en.wikipedia.org/wiki/SOLID)