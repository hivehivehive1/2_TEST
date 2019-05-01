package day20_FOR_LOOPS;
public class PrintEachChar {
	public static void main(String[] args) {
		String word = "Wooden Spoon";
		//using FOR LOOP, print each char one by one
		for(int i = 0; i < word.length(); i++) {
			System.out.println(word.charAt(i) + " ");
		}
		System.out.println();
		//using FOR LOOP, print only consonants. |udalit' vse v IF|
		for(int i = 0; i < word.length(); i++) {
			char letter2 = word.toLowerCase().charAt(i);
			if(!(letter2 == 'a' || letter2 == 'e' || letter2 == 'o' || letter2 == 'i' || letter2 == 'u')) {
				System.out.print(letter2 + ", ");
		}}
		System.out.println();
		//using FOR LOOP, print only vowel (a, e, o, i, u) |ostavit vse v IF|
		for(int i = 0; i < word.length(); i++) {
			char letter = word.toLowerCase().charAt(i);
			if(letter == 'a' || letter == 'e' || letter == 'o' || letter == 'i' || letter == 'u') {
				System.out.print(letter + ", ");
}}}}