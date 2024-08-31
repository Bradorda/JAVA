package org.example;

public class CharEspecial extends ChainCharacteres {
    @Override
    protected boolean verificarLogin(String nome, String senha) {
        if (senha.chars().anyMatch(ch -> "@#$%&*".indexOf(ch) >= 0)) {
            System.out.println("Valido: Caracter Especial");
            return true;
        }
        System.out.println("Senha Inválida: Nenhum Caracter Especial");
        return false;
    }
}
