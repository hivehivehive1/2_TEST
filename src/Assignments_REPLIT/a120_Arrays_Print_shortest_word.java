package Assignments_REPLIT;
import java.util.Scanner;
public class a120_Arrays_Print_shortest_word {
	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		String[] str = {scan.next(),scan.next(),scan.next(),scan.next(),scan.next(),scan.next()};
		String[] str = {"java", "cable", "red", "vivid", "remedy", "grace"};
		
		String min = str[0];
		for (int i = 0; i < str.length - 1; i++) {

			if (min.length() > str[i + 1].length()) {
				min = str[i + 1];

			}
		}
		System.out.println(min);
	}
}