package day16_Strings_manipulatuion_METHODS;
import java.util.Scanner;
public class Replace {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Type word(s): ");
		String words = s.nextLine();
		System.out.println(words.replace("a", "b"));
		
		System.out.println(words.replace("sad", "happy"));	
}}