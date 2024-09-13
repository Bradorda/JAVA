package org.example;

import java.util.ArrayList;
import java.util.List;


class Usuario {
    private String nome;
    private List<String> generosInteressados = new ArrayList<>();

    public Usuario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void adicionarInteresse(String genero) {
        generosInteressados.add(genero);
    }

    public void removerInteresse(String genero) {
        generosInteressados.remove(genero);
    }

    public List<String> getGenerosInteressados() {
        return generosInteressados;
    }

    public boolean estaInteressado(String genero) {
        return generosInteressados.contains(genero);
    }
}
