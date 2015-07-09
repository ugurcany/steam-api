package me.ugurcan.test;

import me.ugurcan.dictionaryapi.BabylonAPI;
import me.ugurcan.dictionaryapi.BilingualDictAPI;
import me.ugurcan.dictionaryapi.MonolingualDictAPI;
import me.ugurcan.dictionaryapi.Results;
import me.ugurcan.dictionaryapi.SozlukNetAPI;
import me.ugurcan.dictionaryapi.TurengAPI;
import me.ugurcan.dictionaryapi.ZarganAPI;

public class Test {

    public static void main(String[] args) {

        BilingualDictAPI tureng = new TurengAPI();
        // input can be in Turkish or English
        Results results = tureng.translate("spit out");
        results.print();

        BilingualDictAPI zargan = new ZarganAPI();
        // input can be in Turkish or English
        results = zargan.translate("süpürmek");
        results.print();

        MonolingualDictAPI sozlukNet = new SozlukNetAPI();
        // input can be in Turkish or English
        results = sozlukNet.getDefinitionOf("pay");
        results.print();

        MonolingualDictAPI babylon = new BabylonAPI();
        // input can only be in English
        results = babylon.getDefinitionOf("get on");
        results.print();

    }

}
