package me.ugurcan.turengapi;

public class Result {
	
	private String word, type, category;
	
	public Result(String word, String type, String category){
		
		this.word = word;
		if(type.equals(""))
			this.type = "-";
		else
			this.type = type;
		this.category = category;
		
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
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
		return category + " -> " + "(" + type + ") " +  word;
	}

}
