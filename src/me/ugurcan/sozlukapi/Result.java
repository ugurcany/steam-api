package me.ugurcan.sozlukapi;

public class Result {

    private String source, translation, lang2lang, type, category;

    public Result(String source, String translation, String lang2lang, String type, String category) {

        this.source = source;
        this.translation = translation;
        this.lang2lang = lang2lang;
        if (type.equals(""))
            this.type = "-";
        else
            this.type = type;
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

    // type
    public String getType() {
        return type;
    }

    protected void setType(String type) {
        this.type = type;
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
        return lang2lang + ":\t" + source + " -> " + "(" + category + ", " + type + ") " + translation;
    }

}
