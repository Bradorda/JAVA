package org.example;
import java.util.ArrayList;
import java.util.List;

public abstract class Secretaria {

    public static boolean MatricularAlunoDisciplina(Aluno aluno,Disciplina disciplina){
        if(!disciplina.getAluno().contains(aluno)){
            disciplina.getAluno().add(aluno);
            return true;
        }else
            return false;
    }

    public static boolean RemoverAlunoDisciplina(Aluno aluno,Disciplina disciplina){
        if(disciplina.getAluno().contains(aluno)){
            disciplina.getAluno().remove(aluno);
            return true;
        }else
            return false;
    }
}
