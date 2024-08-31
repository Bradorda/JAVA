package org.example;

public class CharSequencial extends ChainCharacteres {
    @Override
    protected boolean verificarLogin(String nome, String senha) {
        for (int i = 0; i < senha.length() - 2; i++) {
            if (Character.isDigit(senha.charAt(i)) &&
                    Character.isDigit(senha.charAt(i + 1)) &&
                    Character.isDigit(senha.charAt(i + 2))) {
                System.out.println("Senha Inválida: Sequência de 3 números consecutivos");
                return false;
            }
        }
        System.out.println("Valido: Nenhuma Sequência de 3 Números");
        return true;
    }
}
