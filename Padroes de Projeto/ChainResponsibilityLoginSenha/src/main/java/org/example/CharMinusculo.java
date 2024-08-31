package org.example;

public class CharMinusculo extends ChainCharacteres {
    @Override
    protected boolean verificarLogin(String nome, String senha) {
        if (senha.chars().anyMatch(Character::isLowerCase)) {
            System.out.println("Valido: Caracter Minúsculo");
            return true;
        }
        System.out.println("Senha Inválida: Nenhuma letra Minúscula");
        return false;
    }
}
