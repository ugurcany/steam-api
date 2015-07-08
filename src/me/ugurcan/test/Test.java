package me.ugurcan.test;

import java.util.ArrayList;

import me.ugurcan.dictionaryapi.DictionaryAPI;
import me.ugurcan.dictionaryapi.Result;
import me.ugurcan.dictionaryapi.TurengAPI;
import me.ugurcan.dictionaryapi.ZarganAPI;

public class Test {

    public static void main(String[] args) {

        DictionaryAPI tureng = new TurengAPI();
        DictionaryAPI zargan = new ZarganAPI();

        // input can be in Turkish or English
        ArrayList<Result> results = tureng.translate("pay out");

        for (Result result : results)
            System.out.println(result);

        System.out.println();

        // input can be in Turkish or English
        results = zargan.translate("geri götürmek");

        for (Result result : results)
            System.out.println(result);

    }

}
