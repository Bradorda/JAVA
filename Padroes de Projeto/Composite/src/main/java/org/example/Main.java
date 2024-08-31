package org.example;

public class Main {
    public static void main(String[] args) {
        Caixa geradorDeCaixa = new Caixa();

        geradorDeCaixa.gerarCaixa("bronze");
        System.out.println();
        geradorDeCaixa.gerarCaixa("prata");
        System.out.println();
        geradorDeCaixa.gerarCaixa("ouro");
        System.out.println();
        geradorDeCaixa.gerarCaixa("platina");
    }
}
