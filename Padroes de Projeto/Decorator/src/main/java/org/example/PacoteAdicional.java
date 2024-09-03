package org.example;

public abstract class PacoteAdicional implements Assinatura {
    protected Assinatura assinatura;

    public PacoteAdicional(Assinatura assinatura) {
        this.assinatura = assinatura;
    }

    @Override
    public void assinar() {
        this.assinatura.assinar();
    }
}
