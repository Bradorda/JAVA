package org.example;

public class Main {
    public static void main(String[] args) {
        IGamesFactory blizzard = new Bliizard();
        IGamesFactory riotGames = new RiotGames();

        IMMORPG worldOfWarcraft = blizzard.jogoMundoAberto();
        IFPS overWatch = blizzard.jogoDeTiro();
        IFPS valorant = riotGames.jogoDeTiro();
        IMOBA leagueOfLegends = riotGames.jogoDueloXEquipes();

        worldOfWarcraft.caracteristicasJogoMMORPG();
        overWatch.caracteristicasJogoFPS();
        valorant.caracteristicasJogoFPS();
        leagueOfLegends.caracteristicasJogoMoba();

    }
}