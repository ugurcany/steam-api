package me.ugurcan.steamapi;

import java.util.ArrayList;

public class GameExtra {

    private String id;
    private String description;
    private String headerImageURL;
    private ArrayList<String> screenshotURLs;
    private String releaseDate;
    private String metascore;
    private ArrayList<String> details;
    private ArrayList<String> tags;

    public GameExtra(String id, String description, String headerImageURL, ArrayList<String> screenshotURLs, String releaseDate, String metascore, ArrayList<String> details, ArrayList<String> tags) {

        this.id = id;

        if (description.equals(""))
            this.description = "?";
        else
            this.description = description;

        if (headerImageURL.equals(""))
            this.headerImageURL = "?";
        else
            this.headerImageURL = headerImageURL;

        this.screenshotURLs = screenshotURLs;

        if (releaseDate.equals(""))
            this.releaseDate = "?";
        else
            this.releaseDate = releaseDate;

        if (metascore.equals(""))
            this.metascore = "?";
        else
            this.metascore = metascore;

        this.details = details;

        this.tags = tags;

    }

    // id
    public String getId() {
        return id;
    }

    protected void setId(String id) {
        this.id = id;
    }

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
        String printOut = "=============<id: " + id + " - extra>=============\n";

        if (!description.equals("?"))
            printOut += "description: " + description + "\n";

        if (!headerImageURL.equals("?"))
            printOut += "header image url: " + headerImageURL + "\n";

        if (!screenshotURLs.isEmpty())
            printOut += "screenshot urls: " + screenshotURLs + "\n";

        if (!releaseDate.equals("?"))
            printOut += "release date: " + releaseDate + "\n";

        if (!metascore.equals("?"))
            printOut += "metascore: " + metascore + "\n";

        if (!details.isEmpty())
            printOut += "details: " + details + "\n";

        if (!tags.isEmpty())
            printOut += "tags: " + tags + "\n";

        printOut += "=============<id: " + id + " - extra>=============";
        return printOut;
    }

}
