package org.example;

import java.util.ArrayList;
import java.util.List;


class PlataformaVideo {
    private List<Observer> observadores = new ArrayList<>();
    private List<Filme> filmes = new ArrayList<>();

    public void addObserver(Observer observer) {
        observadores.add(observer);
    }

    public void removeObserver(Observer observer) {
        observadores.remove(observer);
    }

    public void adicionarFilme(Filme filme) {
        filmes.add(filme);
        notificarObservadores(filme);
    }

    public void notificarObservadores(Filme filme) {
        for (Observer observer : observadores) {
            UsuarioConcreto usuarioConcreto = (UsuarioConcreto) observer;
            Usuario usuario = usuarioConcreto.getUsuario();
            if (usuario.estaInteressado(filme.getGenero())) {
                usuarioConcreto.update("Novo filme adicionado: " + filme.getTitulo() + " (" + filme.getGenero() + ")");
            }
        }
    }
}
