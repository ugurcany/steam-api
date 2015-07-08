package me.ugurcan.dictionaryapi;

import java.util.ArrayList;

public class Results extends ArrayList<Result> {

    private String apiName;

    public Results(String apiName) {

        this.apiName = apiName;

    }

    // print all results
    public void print() {
        System.out.println("=============" + apiName + "=============");

        if (this.isEmpty())
            System.out.println("No result found!");
        else
            for (Result result : this)
                System.out.println(result);

        System.out.println("=============" + apiName + "=============");
    }

}
