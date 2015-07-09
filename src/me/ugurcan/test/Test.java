package me.ugurcan.test;

import me.ugurcan.steamapi.Games;
import me.ugurcan.steamapi.SteamAPI;

public class Test {

    public static void main(String[] args) {

        SteamAPI steam = new SteamAPI();
        Games games = steam.searchGame("company of heroes");
        games.printAll();

    }

}
