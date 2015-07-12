package me.ugurcan.steamapi;

import java.util.ArrayList;

public class Game {

    private String id;
    private String title;
    private String price;
    private String discount;
    private String discountedPrice;
    private String reviewSummary;
    private ArrayList<String> platforms;
    private String addedOn;
    private String imageURL;
    // ================== EXTRA ==================
    private String description;
    private String headerImageURL;
    private ArrayList<String> screenshotURLs;
    private String releaseDate;
    private String metascore;
    private ArrayList<String> details;
    private ArrayList<String> tags;

    public Game(String id, String title, String price, String discount, String discountedPrice, String reviewSummary, ArrayList<String> platforms, String addedOn, String imageURL) {

        this.id = id;

        this.title = title;

        if (price.equals(""))
            this.price = "?";
        else
            this.price = price;

        if (discount.equals(""))
            this.discount = "?";
        else
            this.discount = discount;

        if (discountedPrice.equals(""))
            this.discountedPrice = "?";
        else
            this.discountedPrice = discountedPrice;

        if (reviewSummary.equals(""))
            this.reviewSummary = "?";
        else
            this.reviewSummary = reviewSummary;

        this.platforms = platforms;

        if (addedOn.equals(""))
            this.addedOn = "?";
        else
            this.addedOn = addedOn;

        if (imageURL.equals(""))
            this.imageURL = "?";
        else
            this.imageURL = imageURL;

        // ================== EXTRA ==================
        this.description = "?";
        this.headerImageURL = "?";
        this.screenshotURLs = null;
        this.releaseDate = "?";
        this.metascore = "?";
        this.details = null;
        this.tags = null;

    }

    // id
    public String getId() {
        return id;
    }

    protected void setId(String id) {
        this.id = id;
    }

    // title
    public String getTitle() {
        return title;
    }

    protected void setTitle(String title) {
        this.title = title;
    }

    // price
    public String getPrice() {
        return price;
    }

    protected void setPrice(String price) {
        this.price = price;
    }

    // discounted price
    public String getDiscountedPrice() {
        return discountedPrice;
    }

    protected void setDiscountedPrice(String discountedPrice) {
        this.discountedPrice = discountedPrice;
    }

    // discount
    public String getDiscount() {
        return discount;
    }

    protected void setDiscount(String discount) {
        this.discount = discount;
    }

    // review summary
    public String getReviewSummary() {
        return reviewSummary;
    }

    protected void setReviewSummary(String reviewSummary) {
        this.reviewSummary = reviewSummary;
    }

    // platforms
    public ArrayList<String> getPlatforms() {
        return platforms;
    }

    protected void setPlatforms(ArrayList<String> platforms) {
        this.platforms = platforms;
    }

    // added on
    public String getAddedOn() {
        return addedOn;
    }

    protected void setAddedOn(String addedOn) {
        this.addedOn = addedOn;
    }

    // image url
    public String getImageURL() {
        return imageURL;
    }

    protected void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    // ================== EXTRA ==================
    // description
    public String getDescription() {
        return description;
    }

    protected void setDescription(String description) {
        this.description = description;
    }

    // headerImageURL
    public String getHeaderImageURL() {
        return headerImageURL;
    }

    protected void setHeaderImageURL(String headerImageURL) {
        this.headerImageURL = headerImageURL;
    }

    // screenshotURLs
    public ArrayList<String> getScreenshotURLs() {
        return screenshotURLs;
    }

    protected void setScreenshotURLs(ArrayList<String> screenshotURLs) {
        this.screenshotURLs = screenshotURLs;
    }

    // release date
    public String getReleaseDate() {
        return releaseDate;
    }

    protected void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    // metascore
    public String getMetascore() {
        return metascore;
    }

    protected void setMetascore(String metascore) {
        this.metascore = metascore;
    }

    // tags
    public ArrayList<String> getTags() {
        return tags;
    }

    protected void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }

    // details
    public ArrayList<String> getDetails() {
        return details;
    }

    protected void setDetails(ArrayList<String> details) {
        this.details = details;
    }

    // print neatly
    @Override
    public String toString() {
        String printOut = "=============<id: " + id + ">=============\n";

        printOut += "title: " + title + "\n";

        if (!price.equals("?"))
            printOut += "price: " + price + "\n";

        if (!discount.equals("?"))
            printOut += "discounted price: " + discountedPrice + " (" + discount + ")" + "\n";

        if (platforms != null && !platforms.isEmpty())
            printOut += "platforms: " + platforms + "\n";

        if (!reviewSummary.equals("?"))
            printOut += "review summary: " + reviewSummary + "\n";

        if (!addedOn.equals("?"))
            printOut += "added on: " + addedOn + "\n";

        if (!imageURL.equals("?"))
            printOut += "image url: " + imageURL + "\n";

        // ================== EXTRA ==================
        if (!description.equals("") && !description.equals("?"))
            printOut += "description: " + description + "\n";

        if (!headerImageURL.equals("") && !headerImageURL.equals("?"))
            printOut += "header image url: " + headerImageURL + "\n";

        if (screenshotURLs != null && !screenshotURLs.isEmpty())
            printOut += "screenshot urls: " + screenshotURLs + "\n";

        if (!releaseDate.equals("") && !releaseDate.equals("?"))
            printOut += "release date: " + releaseDate + "\n";

        if (!metascore.equals("") && !metascore.equals("?"))
            printOut += "metascore: " + metascore + "\n";

        if (details != null && !details.isEmpty())
            printOut += "details: " + details + "\n";

        if (tags != null && !tags.isEmpty())
            printOut += "tags: " + tags + "\n";

        printOut += "=============<id: " + id + ">=============";
        return printOut;
    }

}
