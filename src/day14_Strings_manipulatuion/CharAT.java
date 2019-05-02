package day14_Strings_manipulatuion;
public class CharAT {
	public static void main(String[] args) {
		String word = "Computer";
		System.out.println(word.length()); //8 chars
		
		//print all character one by one
	    System.out.println(word.charAt(0));
		System.out.println(word.charAt(1));
		System.out.println(word.charAt(2));
		System.out.println(word.charAt(3));
		System.out.println(word.charAt(4));
		System.out.println(word.charAt(5));
	//	System.out.println(word.charAt(10));
		
//		String word and check if first character is 'J'
		String word2 = "Java";
		if(word2.charAt(0) == ('J')) {
			System.out.println("J is first char"); //J is first char
		}else {
			System.out.println("J is not first char");
		}
		//String word3 that consists of 5 characters
		//Check if first and last characters are same,
		//true => "First and last match"
		//false => "First and last are different"
		String word3 = "civic";
		char first = word3.charAt(0); //c
		char last = word3.charAt(4);  //c
		if(first == last) {
			System.out.println("Fist and last match"); //Fist and last match
		}else {
			System.out.println("Do not match");
		}
		//String word4 => always print the last character
		//no matter the length
		String word4 = "Java";
		char lastChar = word4.charAt(word4.length() -1);
		System.out.println("Last value of " + word4 + " is " + lastChar);
		
		
}}