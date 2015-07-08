package me.ugurcan.test;

import me.ugurcan.dictionaryapi.BabylonAPI;
import me.ugurcan.dictionaryapi.DictionaryAPI;
import me.ugurcan.dictionaryapi.Results;
import me.ugurcan.dictionaryapi.TurengAPI;
import me.ugurcan.dictionaryapi.ZarganAPI;

public class Test {

    public static void main(String[] args) {

        DictionaryAPI tureng = new TurengAPI();
        // input can be in Turkish or English
        Results results = tureng.translate("spit out");
        results.print();

        DictionaryAPI zargan = new ZarganAPI();
        // input can be in Turkish or English
        results = zargan.translate("geri götürmek");
        results.print();

        BabylonAPI babylon = new BabylonAPI();
        // input can only be in English
        results = babylon.getDefinitionOf("get on");
        results.print();

    }

}
