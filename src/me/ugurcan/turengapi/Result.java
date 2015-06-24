package me.ugurcan.turengapi;

public class Result {
	
	private String meaning, type, category;

	public Result(String meaning, String type, String category){
		
		this.meaning = meaning;
		if(type.equals(""))
			this.type = "-";
		else
			this.type = type;
		this.category = category;
		
	}

	
	public String getMeaning() {
		return meaning;
	}

	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	@Override
	public String toString(){
		return category + " -> " + "(" + type + ") " +  meaning;
	}

}
