package me.ugurcan.dictionaryapi;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ZarganAPI extends BilingualDictAPI {

    private static final String apiName = "Zargan";

    public ZarganAPI() {

    }

    @Override
    public Results translate(String input) {

        input = Utils.replaceTurkishChars(input);

        //System.out.println(input);

        Results results = new Results(apiName);
        results.addAll(translateHelper(input, "en"));
        results.addAll(translateHelper(input, "tr"));

        return results;

    }

    private Results translateHelper(String input, String lang) {

        Results results = new Results(apiName);

        try {

            Document doc = Jsoup.connect("http://www2.zargan.com/tr/page/search?Text=" + input + "&FromLanguage=" + lang).get();
            Elements elements = doc.getElementsByClass("resultsRow");

            for (Element element : elements) {
                if (element.getElementsByClass("resultLink").isEmpty())
                    continue;

                String sourceLang = element.select("img").get(1).attr("data-from-lang");
                String source = element.getElementsByClass("resultLink").get(0).text();

                String translationLang = element.select("img").get(1).attr("data-to-lang");
                String translation = element.getElementsByClass("resultLink").get(1).text();

                String lang2lang = sourceLang + "-" + translationLang;
                String partOfSpeech = element.getElementsByClass("categoryTypeStyle").get(1).text();
                String category = element.getElementsByClass("categoryTypeStyle").get(3).text();

                results.add(new Result(source, translation, lang2lang, partOfSpeech, category));
            }

        } catch (Exception ex) {
            results.clear();
        }

        return results;

    }

}
