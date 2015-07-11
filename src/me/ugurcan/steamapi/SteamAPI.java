package me.ugurcan.steamapi;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.Locale;

public class SteamAPI {

    public SteamAPI() {

    }

    public Games searchGame(String gameTitle, int upperLimit, SearchMode searchMode) {

        gameTitle = gameTitle.toLowerCase(Locale.ENGLISH);
        String sortBy = Utils.bringSortBy(searchMode);

        Games games = new Games();

        if (upperLimit <= 0)
            return games;

        try {

            int count = 0;
            int page = 0;
            boolean stillFound = true;

            while (stillFound) {
                ///////////////////////
                stillFound = false;
                page++;
                ///////////////////////

                Document doc = Jsoup.connect("http://store.steampowered.com/search/?term=" + gameTitle + "&sort_by=" + sortBy + "&page=" + page).get();
                Elements elements = doc.getElementsByAttributeValue("id", "search_result_container").select("a");

                for (Element element : elements) {
                    String id = element.attr("data-ds-appid").trim();
                    if (id.equals(""))
                        continue;

                    //title
                    String title = element.getElementsByClass("title").text().trim();

                    //discount
                    String discount = element.getElementsByClass("search_discount").text().trim();

                    //price & discounted price
                    String price;
                    String discountedPrice;
                    if (discount.equals("")) {
                        price = element.getElementsByClass("search_price").text().trim();
                        discountedPrice = "";
                    } else {
                        Elements priceElm = element.getElementsByClass("search_price");

                        int startIndex = priceElm.toString().indexOf("<br>") + 4;
                        int endIndex = priceElm.toString().indexOf("</div>");

                        price = priceElm.select("strike").text();
                        discountedPrice = priceElm.toString().substring(startIndex, endIndex).trim();
                    }

                    //platforms
                    ArrayList<String> platforms = new ArrayList<String>();
                    Elements platformElms = element.select("p").select("span");
                    for (Element platformElm : platformElms) {
                        String platform = platformElm.attr("class").split(" ")[1].trim();
                        platforms.add(platform);
                    }

                    //review summary
                    String reviewSummary = element.getElementsByClass("search_review_summary").attr("data-store-tooltip").trim();
                    if (!reviewSummary.equals("")) {
                        String[] reviewSummaryArray = reviewSummary.split("<br>");
                        reviewSummary = reviewSummaryArray[0] + " (" + reviewSummaryArray[1] + ")";
                    }

                    //added on
                    String addedOn = element.getElementsByClass("search_released").text().trim();

                    //image url
                    String imageURL = element.select("img").attr("src").trim();

                    games.add(new Game(id, title, price, discount, discountedPrice, reviewSummary, platforms, addedOn, imageURL));
                    ///////////////////////
                    stillFound = true;
                    count++;
                    if (count == upperLimit)
                        break;
                    ///////////////////////
                }

                if (count == upperLimit)
                    break;
            }

        } catch (Exception ex) {
            ex.printStackTrace();
            games.clear();
        }

        return games;

    }

    public GameExtra retrieveExtraInfo(String gameId) {

        GameExtra gameExtra = null;

        try {

            Document doc = Jsoup.connect("http://store.steampowered.com/app/" + gameId).get();

            //description
            String description = doc.getElementsByClass("game_description_snippet").text().trim();

            //headerImageURL
            String headerImageURL = doc.getElementsByAttributeValue("rel", "image_src").attr("href").trim();

            //release date
            String releaseDate = doc.getElementsByClass("date").text().trim();

            //metascore
            String metascore = doc.getElementsByAttributeValue("id", "game_area_metascore").text().trim();

            //details
            ArrayList<String> details = new ArrayList<String>();
            Elements detailsElms = doc.getElementsByClass("game_area_details_specs");
            for (Element detailElm : detailsElms) {
                String detail = detailElm.text().trim();
                details.add(detail);
            }

            //tags
            ArrayList<String> tags = new ArrayList<String>();
            Elements tagElms = doc.getElementsByClass("glance_tags").select("a");
            for (Element tagElm : tagElms) {
                String tag = tagElm.text().trim();
                tags.add(tag);
            }

            gameExtra = new GameExtra(gameId, description, headerImageURL, releaseDate, metascore, details, tags);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return gameExtra;

    }

}
