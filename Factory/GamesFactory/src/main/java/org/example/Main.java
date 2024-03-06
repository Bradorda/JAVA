package org.example;

public class Main {
    public static void main(String[] args) {
        IGamesFactory blizzard = new Bliizard();
        IGamesFactory riotGames = new RiotGames();

        IMMORPG worldOfWarcraft = blizzard.jogoMundoAberto();
        IFPS overWatch = blizzard.jogoDeTiro();
        IFPS valorant = riotGames.jogoDeTiro();
        IMOBA leagueOfLegends = riotGames.jogoDueloXEquipes();
        IMMORPG legendsOfRuneterra = new LegendsOfRuneterra();
        IMOBA heroesOftheStorm = new HeroesOfTheStorm();

        heroesOftheStorm.caracteristicasJogoMoba();
        overWatch.caracteristicasJogoFPS();
        valorant.caracteristicasJogoFPS();
        leagueOfLegends.caracteristicasJogoMoba();
        legendsOfRuneterra.caracteristicasJogoMMORPG();
        worldOfWarcraft.caracteristicasJogoMMORPG();

    }
}