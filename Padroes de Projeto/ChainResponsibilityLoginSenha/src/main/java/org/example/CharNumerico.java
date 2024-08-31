package org.example;

public class CharNumerico extends ChainCharacteres {
    @Override
    protected boolean verificarLogin(String nome, String senha) {
        if (senha.chars().anyMatch(Character::isDigit)) {
            System.out.println("Valido: Pelo menos 1 número");
            return true;
        }
        System.out.println("Senha Inválida: Nenhum Número");
        return false;
    }
}
