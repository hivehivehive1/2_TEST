package day15_Strings_manipulatuion;
import java.util.Scanner;
public class a069_Print_half_twice {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		String word2 = (word.substring(0, word.length() / 2));
		System.out.println(word2 + word2);
	}
}