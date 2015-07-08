package me.ugurcan.dictionaryapi;

public class Result {

    private String source, translation, lang2lang, partOfSpeech, category;

    public Result(String source, String translation, String lang2lang, String partOfSpeech, String category) {

        this.source = source;
        this.translation = translation;
        this.lang2lang = lang2lang;
        if (partOfSpeech.equals(""))
            this.partOfSpeech = "-";
        else
            this.partOfSpeech = partOfSpeech;
        if (category.equals(""))
            this.category = "-";
        else
            this.category = category;

    }

    // source
    public String getSource() {
        return source;
    }

    protected void setSource(String source) {
        this.source = source;
    }

    // translation
    public String getTranslation() {
        return translation;
    }

    protected void setTranslation(String translation) {
        this.translation = translation;
    }

    // lang2lang
    public String getLang2lang() {
        return lang2lang;
    }

    protected void setLang2lang(String lang2lang) {
        this.lang2lang = lang2lang;
    }

    // partOfSpeech
    public String getPartOfSpeech() {
        return partOfSpeech;
    }

    protected void setPartOfSpeech(String partOfSpeech) {
        this.partOfSpeech = partOfSpeech;
    }

    // category
    public String getCategory() {
        return category;
    }

    protected void setCategory(String category) {
        this.category = category;
    }

    // print neatly
    @Override
    public String toString() {
        if (category.equals("-") && partOfSpeech.equals("-"))
            return lang2lang + ":\t" + source + " -> " + translation;
        if (category.equals("-"))
            return lang2lang + ":\t" + source + " -> " + "(" + partOfSpeech + ") " + translation;
        else if (partOfSpeech.equals("-"))
            return lang2lang + ":\t" + source + " -> " + "(" + category + ") " + translation;
        else
            return lang2lang + ":\t" + source + " -> " + "(" + category + ", " + partOfSpeech + ") " + translation;
    }

}
