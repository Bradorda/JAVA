<h1>Princípios SOLID</h1>

<p>Bom dia, professor! Tudo bem com você? Eu espero que sim.</p>
<p>Através deste arquivo, irei explicar como foram implementados os princípios SOLID em cada classe, mostrando a maneira incorreta e a correta para cada princípio.</p>

<ul> Lista dos Princípios:
<li><b>S</b>ingle Responsibility Principle (SRP) - Princípio da Responsabilidade Única</li>
<li><b>O</b>pen/Closed Principle (OCP) - Princípio do Aberto/Fechado</li>
<li><b>L</b>iskov Substitution Principle (LSP) - Princípio da Substituição de Liskov</li>
<li><b>I</b>nterface Segregation Principle (ISP) - Princípio da Segregação de Interface</li> 
<li><b>D</b>ependency Inversion Principle (DIP) - Princípio da Inversão de Dependência</li>
</ul>
---

<h2>1. Single Responsibility Principle (SRP)</h2> 
<p>O princípio da responsabilidade única afirma que uma classe deve ter apenas um motivo para mudar.</p> 

<h3>Exemplo Incorreto:</h3>
<p>A classe abaixo <b></b>viola o SRP</b> porque mistura </b>lógica geração de relatorios com a exportação para PDF<b>.</p>

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
<h3>Exemplo Correto:</h3>
<p>RelatorioVendas agora só cuida da geração do relatório</p>
<p>ExportadorPDF agora só cuida da exportação do relatório.</p>
<p>Se no futuro quisermos exportar para Excel ou Banco de Dados, podemos criar novas classes (ExportadorExcel, ExportadorBanco) sem modificar a classe RelatorioVendas!</p>

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
<h2>Open/Closed Principle (OCP)</h2>
<p>Entidades de software (como classes e metodos) devem estar abertas para extensão, mas fechadas para modificão</p>
<h3>Exemplo Incorreto:</h3>
<p>A classe CalculadoraDesconto não está aberta para extensão e fechada para modificação.</p>
<p>Se quisermos adicionar um novo tipo de cliente (ex: "Cliente Premium"), teremos que modificar a classe, violando o OCP.</p>

```java
public class CalculadoraDesconto_OCP {

    public double calcularDesconto(String tipoCliente, double valorCompra) {
        if (tipoCliente.equals("Comum")) {
            return valorCompra * 0.05;
        } else if (tipoCliente.equals("VIP")) {
            return valorCompra * 0.10;
        } else if (tipoCliente.equals("Funcionário")) {
            return valorCompra * 0.20;
        }
        return 0;
    }
}
```
<h2>Exemplo Correto:</h2>
<p>O código está aberto para extensão (podemos adicionar novos tipos de desconto sem alterar código existente).</p>
<p>Fechado para modificação (não precisamos mexer na Main nem na FabricaDesconto para adicionar novos tipos).</p>

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


