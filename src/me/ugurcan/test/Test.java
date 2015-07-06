package me.ugurcan.test;

import java.util.ArrayList;

import me.ugurcan.sozlukapi.Result;
import me.ugurcan.sozlukapi.ZarganAPI;
import me.ugurcan.sozlukapi.TurengAPI;

public class Test {

	public static void main(String[] args) {

		TurengAPI tureng = new TurengAPI();
		ZarganAPI zargan = new ZarganAPI();
		
		// input can be in Turkish or English
		ArrayList<Result> results = zargan.translate("OĞUL");
		
		for (Result result : results)
			System.out.println( result );

	}

}
