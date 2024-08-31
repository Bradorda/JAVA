package org.example;

public class CharMinimo extends ChainCharacteres {
    @Override
    protected boolean verificarLogin(String nome, String senha) {
        if (senha.length() >= 8) {
            System.out.println("Valido: Número Mínimo de Caracteres");
            return true;
        }
        System.out.println("Senha Inválida: Menos de 8 Caracteres");
        return false;
    }
}
