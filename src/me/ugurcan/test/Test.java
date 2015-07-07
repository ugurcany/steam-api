package me.ugurcan.test;

import java.util.ArrayList;

import me.ugurcan.sozlukapi.Result;
import me.ugurcan.sozlukapi.SozlukAPI;
import me.ugurcan.sozlukapi.TurengAPI;
import me.ugurcan.sozlukapi.ZarganAPI;

public class Test {

    public static void main(String[] args) {

        SozlukAPI tureng = new TurengAPI();
        SozlukAPI zargan = new ZarganAPI();

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
