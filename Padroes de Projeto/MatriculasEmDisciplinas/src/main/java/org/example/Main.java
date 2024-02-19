package org.example;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Leonardo","312312312","12/12/12",25,"masculino",101914);
        Disciplina disciplina = new Disciplina("POO");

        System.out.println(Secretaria.MatricularAlunoDisciplina(aluno,disciplina));
        System.out.println(Secretaria.MatricularAlunoDisciplina(aluno,disciplina));
        System.out.println(Secretaria.RemoverAlunoDisciplina(aluno,disciplina));
        System.out.println(Secretaria.RemoverAlunoDisciplina(aluno,disciplina));
    }

}