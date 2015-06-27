package me.ugurcan.test;

import java.util.ArrayList;

import me.ugurcan.turengapi.Result;
import me.ugurcan.turengapi.TurengAPI;

public class Test {

	public static void main(String[] args) {

		TurengAPI tureng = new TurengAPI();
		
		// input can be in Turkish or English
		ArrayList<Result> results = tureng.translate("hava durumu");
		
		for (Result result : results)
			System.out.println( result );

	}

}
