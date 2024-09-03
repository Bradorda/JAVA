package org.example;

public class PacoteCaixaMisteriosa extends PacoteAdicional {
    public PacoteCaixaMisteriosa(Assinatura assinatura) {
        super(assinatura);
    }

    @Override
    public void assinar() {
        super.assinar();
        System.out.println("Adicionando Pacote de Caixa Misteriosa, por R$29,99");
    }
}