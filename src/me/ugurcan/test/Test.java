package me.ugurcan.test;

import me.ugurcan.dictionaryapi.DictionaryAPI;
import me.ugurcan.dictionaryapi.Results;
import me.ugurcan.dictionaryapi.TurengAPI;
import me.ugurcan.dictionaryapi.ZarganAPI;

public class Test {

    public static void main(String[] args) {

        DictionaryAPI tureng = new TurengAPI();
        DictionaryAPI zargan = new ZarganAPI();

        // input can be in Turkish or English
        Results results = tureng.translate("pay out");
        results.print();

        System.out.println();

        // input can be in Turkish or English
        results = zargan.translate("geri götürmek");
        results.print();

    }

}
