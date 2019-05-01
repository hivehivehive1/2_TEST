package day15_Strings_manipulatuion;
public class IndexOf {
	public static void main(String[] args) {
		String word1 = "github";
		System.out.println(word1.indexOf('g')); //0
		System.out.println(word1.indexOf("i")); //1
		System.out.println(word1.indexOf("java")); //-1
		
		String url = "www.okta.com";
		int i = url.indexOf(".");
		System.out.println("Position of '.' : " + i);
		System.out.println(url.charAt(i + 1)); //o
		
		String title = "Java - Google Search";
		int dash = title.indexOf("-");
		System.out.println(title.charAt(dash - 2)); //a
		System.out.println(title.charAt(dash + 2)); //G
		
		String country = "United States of America";
		int states = country.indexOf("States");
		System.out.println("Posistion of states: " + states); //7
//-----------------------------------------------------		
		//check if C++ is in the word2
		String word2 = "Java, C++, Delphi";
		if(word2.contains("C++")) {               //C++
			System.out.println("C++ is there");
		}else {
			System.out.println("C++ no there");
		}
			
		if(word2.indexOf("C++") > -1) {           //C++
			System.out.println("C++ is there");
		}else {
			System.out.println("C++ no there");
		}
//------------------------------------------------------		
}}
