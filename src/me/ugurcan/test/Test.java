package me.ugurcan.test;

import me.ugurcan.steamapi.Games;
import me.ugurcan.steamapi.SearchMode;
import me.ugurcan.steamapi.SteamAPI;

public class Test {

    public static void main(String[] args) {

        SteamAPI steam = new SteamAPI();

        String gameTitle = "depth";
        int upperLimit = 5; // upper limit for the number of search results
        SearchMode searchMode = SearchMode.RELEVANCE; // see "SearchMode.java" for other search modes
        Games games = steam.searchGame(gameTitle, upperLimit, searchMode);

        games.printAll();

    }

}
