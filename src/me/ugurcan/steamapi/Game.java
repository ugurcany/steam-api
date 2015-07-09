package me.ugurcan.steamapi;

public class Game {

    private String id;
    private String title;
    private String price;
    private String discount;
    private String discountedPrice;
    private String reviewSummary;

    public Game(String id, String title, String price, String discount, String discountedPrice, String reviewSummary) {

        this.id = id;
        this.title = title;
        if(price.equals(""))
            this.price = "?";
        else
            this.price = price;
        if(discount.equals(""))
            this.discount = "?";
        else
            this.discount = discount;
        if(discountedPrice.equals(""))
            this.discountedPrice = "?";
        else
            this.discountedPrice = discountedPrice;
        if(reviewSummary.equals(""))
            this.reviewSummary = "?";
        else
            this.reviewSummary = reviewSummary;

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

    // print neatly
    @Override
    public String toString() {
        String printOut = "=============<" + id + ">=============\n";

        printOut += "title: " + title + "\n";

        if(!price.equals("?"))
            printOut += "price: " + price + "\n";

        if(!discount.equals("?"))
            printOut += "discounted price: " + discountedPrice + " (" + discount + ")" + "\n";

        if(!reviewSummary.equals("?"))
            printOut += "review summary: " + reviewSummary + "\n";

        printOut += "=============<" + id + ">=============";
        return printOut;
    }

}
