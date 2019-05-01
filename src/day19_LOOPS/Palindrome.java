package day19_LOOPS;
import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter word to test: ");
		String word = scan.next();
		String reversed = "";
		//loop through word in reverse order and
		//concetanate each character to reversed string
		int abc = word.length() -1 ;
		while(abc >= 0) {
			reversed = reversed + word.charAt(abc);
			abc--;
		}
		System.out.println(reversed);
		//compare if word and reversed are equal
		if(reversed.equalsIgnoreCase(word)) {
			System.out.println("It's palindrome");
		}else {
			System.out.println("It's NOT palindrome");
}}}