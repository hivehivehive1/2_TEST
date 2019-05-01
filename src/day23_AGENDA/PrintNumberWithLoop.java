package day23_AGENDA;
public class PrintNumberWithLoop {
	public static void main(String[] args) {
//just print from 1 - 10
		for(int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		for(int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
//outer loop
		for(int j = 1; j <= 2; j++) {
			System.out.println();
//inner loop
			for(int i = 1; i <= 10; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		System.out.println("********************");
}}