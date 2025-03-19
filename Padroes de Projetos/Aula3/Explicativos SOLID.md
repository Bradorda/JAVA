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
A classe abaixo **viola o SRP** porque mistura **lógica geração de relatorios com a exportação para PDF**.

```java
public class RelatorioVendas_SRP {

    private List<String> dadosVendas;

    public RelatorioVendas_SRP(List<String> dadosVendas) {
        this.dadosVendas = dadosVendas;
    }

    public void gerarRelatorio() {
        System.out.println("Gerando relatorio de vendas...");
        for (String venda : dadosVendas) {
            System.out.println(venda);
        }
    }

    //violação do principio de responsabilidade unica.
    public void exportarParaPDF() {
        System.out.println("Exportando relatorio para PDF...");
        for (String venda : this.dadosVendas) {
            System.out.println("PDF: " + venda);
        }
    }

}
```
###  Exemplo Correto:
RelatorioVendas agora só cuida da geração do relatório**
ExportadorPDF agora só cuida da exportação do relatório.**
Se no futuro quisermos exportar para Excel ou Banco de Dados, podemos criar novas classes (ExportadorExcel, ExportadorBanco) sem modificar a classe RelatorioVendas!**
```java
public class RelatorioVendas_SRP {

    private List<String> dadosVendas;

    public RelatorioVendas_SRP(List<String> dadosVendas) {
        this.dadosVendas = dadosVendas;
    }

    public void gerarRelatorio() {
        System.out.println("Gerando relatório de vendas...");
        for (String venda : dadosVendas) {
            System.out.println(venda);
        }
    }

    public List<String> getDadosVendas() {
        return dadosVendas;
    }

}
```
```java
public class ExportadorPDF_SRP {

    public void exportar(RelatorioVendas_SRP relatorio) {
        System.out.println("Exportando relatório para PDF...");
        for (String venda : relatorio.getDadosVendas()) {
            System.out.println("PDF: " + venda);
        }
    }
}
```
## **1. Open/Closed Principle (OCP)**  
//explicação OCP
### ❌ Exemplo Incorreto:
A classe CalculadoraDesconto não está aberta para extensão e fechada para modificação.
Se quisermos adicionar um novo tipo de cliente (ex: "Cliente Premium"), teremos que modificar a classe, violando o OCP.

```java
public class CalculadoraDesconto_OCP {

    public double calcularDesconto(String tipoCliente, double valorCompra) {
        if (tipoCliente.equals("Comum")) {
            return valorCompra * 0.05; // 5% de desconto
        } else if (tipoCliente.equals("VIP")) {
            return valorCompra * 0.10; // 10% de desconto
        } else if (tipoCliente.equals("Funcionário")) {
            return valorCompra * 0.20; // 20% de desconto
        }
        return 0;
    }
}
```
###  Exemplo Correto:
O código está aberto para extensão (podemos adicionar novos tipos de desconto sem alterar código existente).
Fechado para modificação (não precisamos mexer na Main nem na FabricaDesconto para adicionar novos tipos).
```java
public interface CalculadoraDesconto_OCP {

    public double calcularDesconto(double valorCompra);

}
```
```java
public class CalcularDescontoClienteComum_OCP implements CalculadoraDesconto_OCP{

    @Override
    public double calcularDesconto(double valorCompra) {
        return valorCompra * 0.05;
    }
}
```
```java
public class CalculadoraDescontoClienteVip_OCP implements CalculadoraDesconto_OCP {

    @Override
    public double calcularDesconto(double valorCompra) {
        return valorCompra * 0.10;
    }
}
```
```java
public class CalculadoraDescontoClienteFuncionario_OCP implements CalculadoraDesconto_OCP {

    @Override
    public double calcularDesconto(double valorCompra) {
        return valorCompra * 0.20;
    }
}


