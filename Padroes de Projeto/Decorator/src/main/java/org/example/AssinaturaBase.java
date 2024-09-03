package org.example;

public class AssinaturaBase implements Assinatura {
    @Override
    public void assinar() {
        System.out.println("Assinando pacote básico, por R$9,99");
    }
}
