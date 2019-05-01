package day23_AGENDA;
public class CheckNumber_ODD_EVAN {
	public static void main(String[] args) {
		for(int a = 0; a <= 10; a++) {
			if(a == 5) {
				break;
			}
			System.out.println("number: " + a);
			}
System.out.println("*************SKIPP from 10 to 20***************");
		for(int s = 1; s <= 30; s++) {
			if(s >= 10 && s <= 20) {
			  continue;
			//  break;
			}
			  System.out.print(s + " ");
			}
System.out.println();
System.out.println("***************************************");		
		for(int i = 0; i <= 30; i++) {
			if(i % 2 == 0) { // == 0 for odd
				continue;
			}
			System.out.print(i + " ");
			}
System.out.println();
System.out.println("***************************************");		
		for(int i = 0; i <= 30; i++) {
			if(i % 2 == 1) { // == 1 for even
				continue;
			}
			System.out.print(i + " ");
			}
}}