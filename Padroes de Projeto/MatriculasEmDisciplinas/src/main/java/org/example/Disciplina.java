package org.example;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    public String nome;

    public List<Aluno> alunos = new ArrayList<>();

    public Disciplina(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Aluno> getAluno() {
        return alunos;
    }

    public void setAluno(List<Aluno> aluno) {
        this.alunos = aluno;
    }
}
