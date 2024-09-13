package org.example;

public class Main {
    public static void main(String[] args) {
        PlataformaVideo plataforma = new PlataformaVideo();


        Usuario usuario1 = new Usuario("Leonardo");
        usuario1.adicionarInteresse("Ação");
        usuario1.adicionarInteresse("Comédia");

        Usuario usuario2 = new Usuario("Maria");
        usuario2.adicionarInteresse("Terror");

        Usuario usuario3 = new Usuario("Pedro");
        usuario3.adicionarInteresse("Ficção Científica");

        Usuario usuario4 = new Usuario("Ana");
        usuario4.adicionarInteresse("Anime");

        Usuario usuario5 = new Usuario("Carlos");
        usuario5.adicionarInteresse("Comédia");


        UsuarioConcreto observer1 = new UsuarioConcreto(usuario1);
        UsuarioConcreto observer2 = new UsuarioConcreto(usuario2);
        UsuarioConcreto observer3 = new UsuarioConcreto(usuario3);
        UsuarioConcreto observer4 = new UsuarioConcreto(usuario4);
        UsuarioConcreto observer5 = new UsuarioConcreto(usuario5);


        plataforma.addObserver(observer1);
        plataforma.addObserver(observer2);
        plataforma.addObserver(observer3);
        plataforma.addObserver(observer4);
        plataforma.addObserver(observer5);


        plataforma.adicionarFilme(new Filme("Vingadores", "Ação"));
        plataforma.adicionarFilme(new Filme("It: A Coisa", "Terror"));
        plataforma.adicionarFilme(new Filme("Interstellar", "Ficção Científica"));
        plataforma.adicionarFilme(new Filme("Naruto", "Anime"));
        plataforma.adicionarFilme(new Filme("Todo Mundo em Pânico", "Comédia"));
    }
}