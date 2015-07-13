package me.ugurcan.steamapi;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.Locale;

public class SteamAPI {

    private String cc;
    private String lang;

    private final int timeout = 10000;

    public SteamAPI(CountryCode countryCode, Language language) {

        this.cc = countryCode.toString().toLowerCase(Locale.ENGLISH);
        this.lang = language.toString().toLowerCase(Locale.ENGLISH);

    }

    public Games searchForGames(String gameTitle, int numOfResults, SearchMode searchMode) {

        gameTitle = gameTitle.toLowerCase(Locale.ENGLISH);
        String sortBy = searchMode.getSortBy();

        Games games = new Games();

        if (gameTitle.length() < 2) {
            System.out.println("Invalid param: gameTitle");
            return games;
        }
        if (numOfResults <= 0) {
            System.out.println("Invalid param: numOfResults");
            return games;
        }

        try {

            int count = 0;
            int page = 0;
            boolean stillFound = true;

            while (stillFound) {
                ///////////////////////
                stillFound = false;
                page++;
                ///////////////////////

                Document doc = Jsoup.connect("http://store.steampowered.com/search/?term=" + gameTitle + "&sort_by=" + sortBy + "&page=" + page + "&cc=" + cc + "&l=" + lang)
                                    .timeout(timeout)
                                    .get();
                Elements elements = doc.getElementsByAttributeValue("id", "search_result_container").select("a");

                for (Element element : elements) {
                    String id = element.attr("data-ds-appid").trim();
                    if (id.equals(""))
                        continue;

                    //title
                    String title = element.getElementsByClass("title").text().trim();

                    //discount percent
                    String discountPercent = element.getElementsByClass("search_discount").text().trim();

                    //price & discounted price
                    String price;
                    String discountedPrice;
                    if (discountPercent.equals("")) {
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

                    //thumbnail url
                    String thumbnailURL = element.select("img").attr("src").trim();

                    games.add(new Game(id, title, price, discountPercent, discountedPrice, reviewSummary, platforms, addedOn, thumbnailURL));
                    ///////////////////////
                    stillFound = true;
                    count++;
                    if (count == numOfResults)
                        break;
                    ///////////////////////
                }

                if (count == numOfResults)
                    break;
            }

        } catch (Exception ex) {
            ex.printStackTrace();
            games.clear();
        }

        return games;

    }

    public void fillWithDetails(Game game) {

        if (game == null || game.getId().equals("")) {
            System.out.println("Invalid game!");
            return;
        }

        try {

            /*Connection.Response agecheckForm = Jsoup.connect("http://store.steampowered.com/agecheck/app/" + game.getId()).timeout(10000)
                    .data("snr", "1_agecheck_agecheck__age-gate")
                    .data("ageDay", "1")
                    .data("ageMonth", "January")
                    .data("ageYear", "1900")
                    .method(Connection.Method.POST)
                    .execute();

            System.out.println(agecheckForm.cookies());*/

            Document doc = Jsoup.connect("http://store.steampowered.com/app/" + game.getId() + "?l=" + lang + "&cc=" + cc).timeout(timeout)
                    /*.data("snr", "1_agecheck_agecheck__age-gate")
                    .data("ageDay", "1")
                    .data("ageMonth", "January")
                    .data("ageYear", "1900")
                    .cookies(agecheckForm.cookies())*/
                    .cookie("birthtime", "-2208959999")
                    .get();

            //description
            String description = doc.getElementsByClass("game_description_snippet").text().trim();
            game.setDescription(description);

            //headerImageURL
            String headerImageURL = doc.getElementsByAttributeValue("rel", "image_src").attr("href").trim();
            game.setHeaderImageURL(headerImageURL);

            //screenshotURLs
            ArrayList<String> screenshotURLs = new ArrayList<String>();
            Elements ssUrlElms = doc.getElementsByClass("highlight_screenshot_link");
            for (Element ssUrlElm : ssUrlElms) {
                String screenshotURL = ssUrlElm.attr("href").trim();
                screenshotURLs.add(screenshotURL);
            }
            game.setScreenshotURLs(screenshotURLs);

            //release date
            String releaseDate = doc.getElementsByClass("date").text().trim();
            game.setReleaseDate(releaseDate);

            //metascore
            String metascore = doc.getElementsByAttributeValue("id", "game_area_metascore").text().trim();
            game.setMetascore(metascore);

            //details
            ArrayList<String> details = new ArrayList<String>();
            Elements detailElms = doc.getElementsByClass("game_area_details_specs");
            for (Element detailElm : detailElms) {
                String detail = detailElm.text().trim();
                details.add(detail);
            }
            game.setDetails(details);

            //tags
            ArrayList<String> tags = new ArrayList<String>();
            Elements tagElms = doc.getElementsByClass("glance_tags").select("a");
            for (Element tagElm : tagElms) {
                String tag = tagElm.text().trim();
                tags.add(tag);
            }
            game.setTags(tags);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}
