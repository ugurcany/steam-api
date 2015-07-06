package me.ugurcan.zarganapi;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;

public class ZarganAPI {
	
	public ZarganAPI(){

	}

	public ArrayList<ZarganResult> translate(String input){
		
		ArrayList<ZarganResult> results = new ArrayList<ZarganResult>();
			
		try{

			Document doc = Jsoup.connect("http://www2.zargan.com/tr/page/search?Text=" + input + "&FromLanguage=en").get();
			Elements elements = doc.getElementsByClass("resultsRow");

			//System.out.println(elements.toString());

			for(Element element : elements){
				if(element.getElementsByClass("resultLink").isEmpty())
					continue;

				String source = element.getElementsByClass("resultLink").get(0).text();

				/*if(!word.equalsIgnoreCase(input))
					continue;*/

				String translation = element.getElementsByClass("resultLink").get(1).text();

				String lang2lang = "en-tr";
				String type = "-";
				String category = "-";

				results.add(new ZarganResult(source, translation, lang2lang, type, category));
			}



			doc = Jsoup.connect("http://www2.zargan.com/tr/page/search?Text=" + input + "&FromLanguage=tr").get();
			elements = doc.getElementsByClass("resultsRow");

			//System.out.println(elements.toString());

			for(Element element : elements){
				if(element.getElementsByClass("resultLink").isEmpty())
					continue;

				String source = element.getElementsByClass("resultLink").get(0).text();

				/*if(!word.equalsIgnoreCase(input))
					continue;*/

				String translation = element.getElementsByClass("resultLink").get(1).text();

				String lang2lang = "tr-en";
				String type = element.getElementsByClass("categoryTypeStyle").get(1).text();
				String category = element.getElementsByClass("categoryTypeStyle").get(3).text();

				results.add(new ZarganResult(source, translation, lang2lang, type, category));
			}
			
		}catch(Exception ex){
			results.clear();
		}
		
		if(results.isEmpty())
			results.add(new ZarganResult("No result found!", "-", "-", "-", "-"));
		
		return results;
		
	}
	
}
