package day23_AGENDA;
import java.util.Scanner;
public class CONCAT_words_with_COMMA {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = "";
		String allWords = "";
		for(int i = 0; i < 3; i++) {
			System.out.println("Enter a 3 words: ");
			str = scan.next();

			if(str.equals("java")) {
				continue;
			}
			allWords += str + ", ";
	}
	System.out.println("All word: " + (allWords.substring(0, allWords.length()-2))); //DEL last ","

}}
