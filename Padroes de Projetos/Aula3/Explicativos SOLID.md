# Princípios SOLID

Bom dia, professor! Tudo bem com você? Eu espero que sim.  
Através deste arquivo, irei explicar como foram implementados os princípios SOLID em cada classe, mostrando a maneira incorreta e a correta para cada princípio.

## Lista dos Princípios:
- **S**ingle Responsibility Principle (SRP) - Princípio da Responsabilidade Única  
- **O**pen/Closed Principle (OCP) - Princípio do Aberto/Fechado  
- **L**iskov Substitution Principle (LSP) - Princípio da Substituição de Liskov  
- **I**nterface Segregation Principle (ISP) - Princípio da Segregação de Interface  
- **D**ependency Inversion Principle (DIP) - Princípio da Inversão de Dependência  

---

## **1. Single Responsibility Principle (SRP)**  
O princípio da responsabilidade única afirma que uma classe deve ter apenas um motivo para mudar.  

### ❌ Exemplo Incorreto:
A classe abaixo **viola o SRP** porque mistura **lógica de cálculo e exibição** no console.

```java
public class Calculadora {
    public int somar(int a, int b) {
        return a + b;
    }

    public void imprimirResultado(int resultado) {
        System.out.println("Resultado: " + resultado);
    }
}
