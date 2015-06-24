package me.ugurcan.turengapi;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {

		TurengAPI tureng = new TurengAPI();
		
		// input can be in Turkish or English
		ArrayList<Result> results = tureng.translate("oðul");
		
		for (Result result : results)
			System.out.println( result.toString() );

	}

}
