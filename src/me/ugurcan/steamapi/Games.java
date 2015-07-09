package me.ugurcan.steamapi;

import java.util.ArrayList;

public class Games extends ArrayList<Game> {

    public Games() {

    }

    // print all games
    public void printAll() {
        if (this.isEmpty())
            System.out.println("No game found!");
        else
            for (Game game : this)
                System.out.println(game);
    }

}
