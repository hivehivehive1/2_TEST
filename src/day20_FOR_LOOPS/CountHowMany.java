package day20_FOR_LOOPS;
public class CountHowMany {
	public static void main(String[] args) {
		//word
		//char to count the number of occurences
		String word = "Computer programming";
		char myChar = 'm';
		
		int counter = 0;
		for(int i = 0; i < word.length(); i++) {
			if(word.charAt(i) == myChar) {
				counter++;
			}
		}								//checking for m CHARS
		System.out.println("Count: " + counter); //3 => m
}}