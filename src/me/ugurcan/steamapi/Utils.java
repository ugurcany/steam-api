package me.ugurcan.steamapi;

public class Utils {

    protected static String bringSortBy(SearchMode searchMode) {

        String sortBy;

        if (searchMode.equals(SearchMode.RELEASEDATE))
            sortBy = "Released_DESC";
        else if (searchMode.equals(SearchMode.NAME))
            sortBy = "Name_ASC";
        else if (searchMode.equals(SearchMode.LOWESTPRICE))
            sortBy = "Price_ASC";
        else if (searchMode.equals(SearchMode.HIGHESTPRICE))
            sortBy = "Price_DESC";
        else if (searchMode.equals(SearchMode.REVIEWS))
            sortBy = "Reviews_DESC";
        else
            sortBy = "_ASC";

        return sortBy;

    }

}
