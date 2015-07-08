package me.ugurcan.dictionaryapi;

import java.util.ArrayList;

public class Results extends ArrayList<Result> {

    public Results() {

    }

    // print all results
    public void print() {
        for (Result result : this)
            System.out.println(result);
    }

}
