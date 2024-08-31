package org.example;

public class CharMaximo extends ChainCharacteres {
    @Override
    protected boolean verificarLogin(String nome, String senha) {
        if (senha.length() <= 16) {
            System.out.println("Valido: Número Máximo de Caracteres");
            mostrarCliente(nome);
            return true;
        }
        System.out.println("Senha Inválida: Mais de 16 Caracteres");
        return false;
    }
}
