package org.example;

public class RiotGames implements IGamesFactory{

    @Override
    public IFPS jogoDeTiro() {
        return new Valorant();
    }

    @Override
    public IMMORPG jogoMundoAberto() {
        return null;
    }

    @Override
    public IMOBA jogoDueloXEquipes() {
        return new LeagueOfLegends();
    }
}
