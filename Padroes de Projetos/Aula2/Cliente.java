package org.example;

public class Cliente extends Pessoa implements Autenticavel{

    public Cliente(int idade, String nome, String cpf, String rg, String data_nascimento) {
        super(idade, nome, cpf, rg, data_nascimento);
    }

    @Override
    public void login() {

    }

    @Override
    public String verificarLenghtCPF(String cpf) {
        return "MENSAGEM";
    }

    @Override
    public String verificarCaractereCPF(String cpf) {
        return "MENSAGEM";
    }
}
