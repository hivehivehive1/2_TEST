package day20_FOR_LOOPS;
import java.util.Scanner;
public class Neighbors {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter word");
		String word = scan.next();
		//aabbcdd 
		//if character and next one same print
		//Beeep - a
		//Beeep - d
		for(int i = 0; i < word.length() -1; i++) {
			if(word.charAt(i) == word.charAt(i + 1)) {
				System.out.println("Beeep - " + word.charAt(i));
}}}}
