package me.ugurcan.steamapi;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.Locale;

public class SteamAPI {

    //private static final String apiName = "Tureng";

    public SteamAPI() {

    }

    public Games searchGame(String input) {

        input = input.toLowerCase(Locale.ENGLISH);

        Games games = new Games();

        try {

            int page = 0;
            boolean stillFound = true;

            while (stillFound) {

                stillFound = false;
                page++;
                ///////////////////////
                if(page == 2)
                    break;
                ///////////////////////

                Document doc = Jsoup.connect("http://store.steampowered.com/search/?term=" + input + "&sort_by=_ASC&page=" + page).get();
                Elements elements = doc.getElementsByAttributeValue("id", "search_result_container").select("a");

                //System.out.println(elements);

                for (Element element : elements) {
                    String id = element.attr("data-ds-appid").trim();
                    if(id.equals(""))
                        continue;

                    String title = element.getElementsByClass("title").text().trim();

                    String discount = element.getElementsByClass("search_discount").text().trim();

                    String price = "";
                    String discountedPrice = "";
                    if (discount.equals("")){
                        price = element.getElementsByClass("search_price").text().trim();
                    }
                    else{
                        Elements priceElm = element.getElementsByClass("search_price");

                        int startIndex = priceElm.toString().indexOf("<br>") + 4;
                        int endIndex = priceElm.toString().indexOf("</div>");

                        price = priceElm.select("strike").text();
                        discountedPrice = priceElm.toString().substring(startIndex, endIndex).trim();
                    }

                    String reviewSummary = element.getElementsByClass("search_review_summary").attr("data-store-tooltip").trim();
                    if (!reviewSummary.equals("")){
                        String[] reviewSummaryArray = reviewSummary.split("<br>");
                        reviewSummary = reviewSummaryArray[0] + " (" + reviewSummaryArray[1] + ")";
                    }

                    games.add(new Game(id, title, price, discount, discountedPrice, reviewSummary));

                    stillFound = true;
                }

            }

        } catch (Exception ex) {
            ex.printStackTrace();
            games.clear();
        }

        return games;

    }

}
