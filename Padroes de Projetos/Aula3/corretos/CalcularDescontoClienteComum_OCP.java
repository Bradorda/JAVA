package org.example.corretos;

public class CalcularDescontoClienteComum_OCP implements CalculadoraDesconto_OCP{

    @Override
    public double calcularDesconto(double valorCompra) {
        return valorCompra * 0.05;
    }
}
