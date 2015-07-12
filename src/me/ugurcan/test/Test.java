package me.ugurcan.test;

import me.ugurcan.steamapi.CountryCode;
import me.ugurcan.steamapi.Game;
import me.ugurcan.steamapi.GameExtra;
import me.ugurcan.steamapi.Games;
import me.ugurcan.steamapi.SearchMode;
import me.ugurcan.steamapi.SteamAPI;

public class Test {

    public static void main(String[] args) {

        SteamAPI steam = new SteamAPI(CountryCode.US);

        String gameTitle = "depth";
        int numOfResults = 5; // upper limit for the number of games to be retrieved
        SearchMode searchMode = SearchMode.RELEVANCE; // see "SearchMode.java" for other search modes

        // search the Steam game store
        Games games = steam.searchStore(gameTitle, numOfResults, searchMode);
        games.printAll();

        // retrieve extra info about a game
        Game game = games.get(0);
        String gameId = game.getId();
        GameExtra gameExtra = steam.retrieveExtraInfo(gameId);
        System.out.print(gameExtra);

    }

}
