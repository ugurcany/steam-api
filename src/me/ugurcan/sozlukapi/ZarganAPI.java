package me.ugurcan.sozlukapi;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;

public class ZarganAPI {
	
	public ZarganAPI(){

	}

	public ArrayList<Result> translate(String input){

		input = Utils.replaceTurkishChars(input);

		//System.out.println(input);
		
		ArrayList<Result> results = new ArrayList<Result>();
			
		try{

			Document doc = Jsoup.connect("http://www2.zargan.com/tr/page/search?Text=" + input + "&FromLanguage=en").get();
			Elements elements = doc.getElementsByClass("resultsRow");
			results.addAll( translateSub(elements) );

			doc = Jsoup.connect("http://www2.zargan.com/tr/page/search?Text=" + input + "&FromLanguage=tr").get();
			elements = doc.getElementsByClass("resultsRow");
			results.addAll( translateSub(elements) );
			
		}catch(Exception ex){
			results.clear();
		}
		
		if(results.isEmpty())
			results.add(new Result("No result found!", "-", "-", "-", "-"));
		
		return results;
		
	}

	private ArrayList<Result> translateSub(Elements elements){

		ArrayList<Result> results = new ArrayList<Result>();

		for(Element element : elements){
			if(element.getElementsByClass("resultLink").isEmpty())
				continue;

			String sourceLang = element.select("img").get(1).attr("data-from-lang");
			String source = element.getElementsByClass("resultLink").get(0).text();

				/*if(!word.equalsIgnoreCase(input))
					continue;*/

			String translationLang = element.select("img").get(1).attr("data-to-lang");
			String translation = element.getElementsByClass("resultLink").get(1).text();

			String lang2lang = sourceLang + "-" + translationLang;
			String type = element.getElementsByClass("categoryTypeStyle").get(1).text();
			String category = element.getElementsByClass("categoryTypeStyle").get(3).text();

			results.add(new Result(source, translation, lang2lang, type, category));
		}

		return results;
	}
	
}
