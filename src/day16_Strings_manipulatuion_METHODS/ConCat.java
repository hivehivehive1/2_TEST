package day16_Strings_manipulatuion_METHODS;
public class ConCat {
	public static void main(String[] args) { //concat working only with String
		String word = "Java";
		System.out.println(word.concat(" + selenium")); //Java + selenium
		
		System.out.println(word); //Java
		
		word = word.concat(" + Eclipse");
		System.out.println(word); //Java + Eclipse
		
		word = word.concat(" Automation");
		System.out.println(word); //Java + Eclipse Automation
		
		//word = word.concat(123456); WILLNOT WORD!!!
		word = word + 123;
		System.out.println(word); //Java + Eclipse Automation123
		
		word = word + true; //concat true to the String
		System.out.println(word); //Java + Eclipse Automation123true
		
		String word2 = "hi";
		word2 = word2.concat("-hey").concat("-how are you").concat("-good");
		System.out.println(word2); //hi-hey-how are you-good
}}
