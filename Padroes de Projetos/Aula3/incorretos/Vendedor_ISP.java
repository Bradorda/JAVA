package org.example.incorretos;

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
