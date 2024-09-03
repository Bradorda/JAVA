package org.example;

public class AssinaturaDecorada implements Assinatura {
    private Assinatura base;
    private PacoteAdicional pacote;

    public AssinaturaDecorada(Assinatura base, PacoteAdicional pacote) {
        this.base = base;
        this.pacote = pacote;
    }

    @Override
    public void assinar() {
        base.assinar();
        pacote.assinar();
    }
}
