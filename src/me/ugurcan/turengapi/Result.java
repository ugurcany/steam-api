package me.ugurcan.turengapi;

public class Result {
	
	private String source, translation, type, category;

	public Result(String source, String translation, String type, String category){
		
		this.source = source;
		this.translation = translation;
		if(type.equals(""))
			this.type = "-";
		else
			this.type = type;
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
	public String toString(){
		return source + " -> " + "(" + category + ", " + type + ") " +  translation;
	}

}
