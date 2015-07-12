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

    // print neatly
    @Override
    public String toString() {
        String printOut = "=============<id: " + id + ">=============\n";

        printOut += "title: " + title + "\n";

        if (!price.equals("?"))
            printOut += "price: " + price + "\n";

        if (!discount.equals("?"))
            printOut += "discounted price: " + discountedPrice + " (" + discount + ")" + "\n";

        if (!platforms.isEmpty())
            printOut += "platforms: " + platforms + "\n";

        if (!reviewSummary.equals("?"))
            printOut += "review summary: " + reviewSummary + "\n";

        if (!addedOn.equals("?"))
            printOut += "added on: " + addedOn + "\n";

        if (!imageURL.equals("?"))
            printOut += "image url: " + imageURL + "\n";

        printOut += "=============<id: " + id + ">=============";
        return printOut;
    }

}
