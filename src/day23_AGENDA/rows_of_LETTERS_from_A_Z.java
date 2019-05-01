package day23_AGENDA;
import java.util.Scanner;
public class rows_of_LETTERS_from_A_Z {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//outer loop will repeat printing of letter as many times as want
		//in this case we are gonna print 3 times
		//so we are reapiting inner loop 3 times
		for(int i = 1; i < 10; i++) {
		//write a for loop. that will print letter from A to Z
			if(i % 2 == 0) {
			for(char letter = 'a'; letter <= 'z'; letter++) {
				System.out.print(letter);
				}
			}else {
				for(char letter = 'z'; letter >= 'a'; letter--) {
					System.out.print(letter);
				}
			}
			System.out.println();
			System.out.println("**************************");
			}
}}