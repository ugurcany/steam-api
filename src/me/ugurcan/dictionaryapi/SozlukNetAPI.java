package me.ugurcan.dictionaryapi;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class SozlukNetAPI extends MonolingualDictAPI {

    private static final String apiName = "SozlukNet";

    public SozlukNetAPI() {

    }

    public Results getDefinitionOf(String input) {

        input = Utils.replaceTurkishChars(input);

        //System.out.println(input);

        Results results = new Results(apiName);

        try {

            Document doc = Jsoup.connect("http://www.sozluk.net/index.php?word=" + input + "&from=tr&to=tr").get();
            Elements elements = doc.select("table").get(0).getElementsByAttributeValue("align", "left");

            for (int i = 0; i < elements.size(); i += 3) {
                String source = elements.get(i).text();
                String[] translations = elements.get(i + 1).text().split("\\*");

                for (String translation : translations)
                    results.add(new Result(source, translation.trim(), "tr-tr", "", ""));
            }

        } catch (Exception ex) {
            results.clear();
        }

        return results;

    }

}
