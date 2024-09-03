package org.example;

public class Main {
    public static void main(String[] args) {
        AssinaturaControlada assinatura = new AssinaturaControlada(new AssinaturaBase());

        assinatura.adicionarPacote(new PacoteMultiDispositivo(new AssinaturaBase()), "MultiDispositivo");
        assinatura.adicionarPacote(new PacoteFreteGratis(new AssinaturaBase()), "FreteGratis");

        assinatura.adicionarPacote(new PacoteFreteGratis(new AssinaturaBase()), "FreteGratis");

        assinatura.assinar();
    }
}
