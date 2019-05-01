package day23_AGENDA;
public class PrintNumberWithLoop2 {
	public static void main(String[] args) {
		for(int a = 1; a <= 10; a++) {
			for(int b = 1; b <= a; b++) {
				System.out.print(b + " ");
			}
			System.out.println();
			}
System.out.println("********************");
		for(int a2 = 10; a2 >= 1; a2--) {
			for(int b2 = 1; b2 <= a2; b2++) {
				System.out.print(b2 + " ");
			}
			System.out.println();
			}
}}