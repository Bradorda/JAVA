package org.example;

public class Bliizard implements IGamesFactory{

    @Override
    public IFPS jogoDeTiro() {
        return new OverWatch();
    }

    @Override
    public IMMORPG jogoMundoAberto() {
        return new WorldOfWarcraft();
    }

    @Override
    public IMOBA jogoDueloXEquipes() {
        return null;
    }
}
