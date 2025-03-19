package org.example.incorretos;


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

