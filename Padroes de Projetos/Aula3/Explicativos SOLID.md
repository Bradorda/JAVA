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
<h2>2. Open/Closed Principle (OCP)</h2>
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
<h3>Exemplo Correto:</h3>
<p>O código está aberto para extensão (podemos adicionar novos tipos de desconto sem alterar código existente).</p>
<p>Fechado para modificação, e aberto para adicionar novos tipos).</p>

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
```
<h2>3. Liskov Substitution Principle (LSP)</h2>
<p>Classes-filhas devem ser capazes de substituir suas classes-mães</p>

<h3>Exemplo Incorreto</h3>
<p>Quadrado herda de Retangulo, mas altera o comportamento dos métodos setLargura e setAltura</p>
<p>Isso quebra a substituição: um Quadrado deveria poder ser usado onde um Retangulo é esperado sem alterar o comportamento esperado</p>

```java
public class Retangulo_LSP {

    protected double largura;
    protected double altura;

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularArea() {
        return largura * altura;
    }
}
```
```java
public class Quadrado_LSP extends Retangulo_LSP {

    @Override
    public void setLargura(double largura) {
        this.largura = largura;
        this.altura = largura; // Mantém a propriedade do quadrado (altura = largura)
    }

    @Override
    public void setAltura(double altura) {
        this.largura = altura;
        this.altura = altura; // Mantém a propriedade do quadrado (altura = largura)
    }
}
```
<h3>Exemplo Correto</h3>
<p>Quadrado e Retangulo não estão mais ligados por herança</p>
<p>Agora ambos implementam Forma, garantindo que cada um tenha seu próprio comportamento correto.</p>
<p>Quadrado e Retangulo podem ser usados sem que um afete o comportamento do outro</p>

```java
public interface Forma_LSP {

    double calcularArea();
}
```
```java
public class Retangulo_LSP implements Forma_LSP {
    private double largura;
    private double altura;

    public Retangulo_LSP(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public double calcularArea() {
        return largura * altura;
    }
}
```
```java
public class Quadrado_LSP implements Forma_LSP{

    private double lado;

    public Quadrado_LSP(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
```
<h2>4. Interface Segregation Principle (ISP)</h2>
<p>Uma classe não deve ser forçada a implementar interfaces e metodos que não serão utilizados</p>

<h3>Exemplo Incorreto</h3>
<p>A interface Funcionario_ISP possui o metodo de comissão, porém a classe Recepcionista_ISP não deve utilizar esse meotodo</p>
<p>A Classe Recepcionista_ISP foi forçada a implementar um metodo que não faz sentido para ela.</p>

```java
public interface Funcionario_ISP {

    public double salario();
    public double comissao();
}
```
```java
public class Vendedor_ISP implements Funcionario_ISP{

    @Override
    public double salario() {
        return 0;
    }

    @Override
    public double comissao() {
        return 0;
    }
}
```
```java
public class Recepcionista_ISP implements Funcionario_ISP {

    @Override
    public double salario() {
        return 0;
    }
    //Recepcionista não deve receber comissão.
    @Override
    public double comissao() {
        return 0;
    }
}
```
<h3>Exemplo Correto</h3>
<p>A Interface Funcionario_ISP tem apenas o metodo salario() </p>
<p>Criamos outra Interface Comissionavel_ISP para calcular a comissão</p>
<p>A Classe Recepcionista_ISP implementa somente Funcionario_ISP, enquanto Vendedor implementa Funcionario_ISP e Comissionavel_ISP</p>

```java
public interface Funcionario_ISP {

    public double salario();
}
```
```java
public interface Comissionavel_ISP {

    public double gerarComissao();
}
```
```java
public class Recepcionista_ISP implements Funcionario_ISP{

    @Override
    public double salario() {
        return 0;
    }
}
```
```java
public class Vendedor_ISP implements Funcionario_ISP,Comissionavel_ISP{
    
    @Override
    public double gerarComissao() {
        return 0;
    }

    @Override
    public double salario() {
        return 0;
    }
}

```
<h2>5. Dependency Inversion Principle (DIP)</h2>
<p>Dependa de abstrações e não de implementações concretas</p>

<h3>Exemplo Incorreto</h3>
<p>ServicoNotificacao_DIP depende diretamente de EmailNotificador_DIP.</p>
<p>Se quisermos adicionar SMS Notification, precisaríamos modificar a classe ServicoNotificacao_DIP, o que viola OCP e DIP</p>
<p>O código depende de uma implementação concreta, e não de uma abstração.</p>


```java
public class EmailNotificador_DIP {

    public void enviarEmail(String mensagem) {
        System.out.println("Enviando e-mail: " + mensagem);
    }
}
```
```java
public class ServicoNotificacao_DIP {

    private EmailNotificador_DIP emailNotificador;

    public ServicoNotificacao_DIP() {
        this.emailNotificador = new EmailNotificador_DIP();
    }

    public void notificar(String mensagem) {
        emailNotificador.enviarEmail(mensagem);
    }
}
```
<h3>Exemplo Correto</h3>
<p>ServicoNotificacao_DIP não depende mais diretamente de EmailNotificador_DIP, mas sim da interface Notificador_DIP.</p>
<p>Agora podemos adicionar novos tipos de notificadores (SMS, etc.) sem modificar ServicoNotificacao_DIP, seguindo o Princípio do Aberto/Fechado (OCP).</p>
<p>Injeção de dependência via construtor, facilitando a troca de implementações e a testabilidade do código.</p>

```java
public interface Notificador_DIP {

    public void enviar(String mensagem);

}
```
```java
public class ServicoNotificacao {

    private Notificador_DIP notificador;

    // Injeção de dependência via construtor
    public ServicoNotificacao(Notificador_DIP notificador) {
        this.notificador = notificador;
    }

    public void notificar(String mensagem) {
        notificador.enviar(mensagem);
    }
}
```
```java
public class EmailNotificador_DIP implements Notificador_DIP{

    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando e-mail: " + mensagem);
    }
}
```
```java
public class SmsNotificador_DIP implements Notificador_DIP{
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando SMS: " + mensagem);
    }
}
