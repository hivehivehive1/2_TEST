package day50_Inheritance_03;

public class Search_Engine_Google extends Search_Engine {
	@Override
	public int search(String item) {
		System.out.println("Google Searching for : " + item);
		int resultsCount = item.length();
		return resultsCount;
	}
//was Protected
	public void search(String item, String item2) {
		System.out.println("Searching for 2 items: " + item + "," );
		int resultCount = item.length() + item2.length();
		System.out.println("Total count: " + resultCount);
	}
//default, protected	
	String clickResult() {
		System.out.println("Clicking result");
		return "Search result page";
	}
	
	
}
