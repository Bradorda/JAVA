package org.example;

public abstract class Pessoa {

    private int idade;
    private String nome;
    private String cpf;
    private String rg;
    private String data_nascimento;

    public Pessoa(int idade, String nome, String cpf, String rg, String data_nascimento) {
        this.idade = idade;
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.data_nascimento = data_nascimento;
    }

    public abstract String verificarLenghtCPF(String cpf);

    public abstract String verificarCaractereCPF(String cpf);

    public String verificarLenghtRG(String cpf){
        //logica
        return "MENSAGEM";
    }

    public String verificarCaractereRG(String cpf){
        //logica
        return "MENSAGEM";
    }

    public int idadePorDataNasc(){
        //logica
        return idade;
    }


    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }
}
