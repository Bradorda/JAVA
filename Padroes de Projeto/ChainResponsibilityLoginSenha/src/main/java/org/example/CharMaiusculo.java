package org.example;

public class CharMaiusculo extends ChainCharacteres {
    @Override
    protected boolean verificarLogin(String nome, String senha) {
        if (senha.chars().anyMatch(Character::isUpperCase)) {
            System.out.println("Valido: Caracter Maiúsculo");
            return true;
        }
        System.out.println("Senha Inválida: Nenhuma letra Maiúscula");
        return false;
    }
}

