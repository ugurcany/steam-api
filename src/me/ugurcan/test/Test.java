package me.ugurcan.test;

import me.ugurcan.steamapi.Games;
import me.ugurcan.steamapi.SteamAPI;

public class Test {

    public static void main(String[] args) {

        SteamAPI steam = new SteamAPI();

        String gameTitle = "company of heroes";
        int upperLimit = 5; // upper limit for the number of search results
        Games games = steam.searchGame(gameTitle, upperLimit);

        games.printAll();

    }

}
