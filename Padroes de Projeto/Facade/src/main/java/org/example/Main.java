package org.example;

public class Main {
    public static void main(String[] args) {
        SistemaDeViagemFacade sistemaDeViagem = new SistemaDeViagemFacade();

        sistemaDeViagem.comprarPacote(
                "João Silva", "123.456.789-00",
                "1a Classe", "1A",
                "Suíte Presidencial", 2,
                "Luxo", "Pix"
        );
    }
}