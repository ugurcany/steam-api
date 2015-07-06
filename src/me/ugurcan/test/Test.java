package me.ugurcan.test;

import java.util.ArrayList;

import me.ugurcan.zarganapi.ZarganAPI;
import me.ugurcan.turengapi.TurengAPI;
import me.ugurcan.turengapi.TurengResult;
import me.ugurcan.zarganapi.ZarganResult;

public class Test {

	public static void main(String[] args) {

		TurengAPI tureng = new TurengAPI();
		
		// input can be in Turkish or English
		ArrayList<TurengResult> resultsTureng = tureng.translate("allying");
		
		/*for (TurengResult result : resultsTureng)
			System.out.println( result );*/


		ZarganAPI zargan = new ZarganAPI();

		// input can be in Turkish or English
		ArrayList<ZarganResult> resultsZargan = zargan.translate("pay");

		for (ZarganResult result : resultsZargan)
			System.out.println( result );

	}

}
