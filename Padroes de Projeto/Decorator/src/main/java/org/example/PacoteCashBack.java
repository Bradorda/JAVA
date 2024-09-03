package org.example;

public class PacoteCashBack extends PacoteAdicional {
    public PacoteCashBack(Assinatura assinatura) {
        super(assinatura);
    }

    @Override
    public void assinar() {
        super.assinar();
        System.out.println("Adicionando Pacote de Cash Back, por R$19,99");
    }
}