package org.example;

public class Aluno extends Pessoa{
    private int matricula;

    public Aluno(String nome, String cpf, String dataNascimento, int idade, String sexo,int matricula) {
        super(nome, cpf, dataNascimento, idade, sexo);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
