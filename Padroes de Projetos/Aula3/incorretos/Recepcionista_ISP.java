package org.example.incorretos;

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
