package org.example.corretos;

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
