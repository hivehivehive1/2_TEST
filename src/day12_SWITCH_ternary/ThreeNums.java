package day12_SWITCH_ternary;
public class ThreeNums {
	public static void main(String[] args) {
//version 1
		int n1 = 10;
		int n2 = 20;
		int n3 = 30;
			  if(n1 > n2 && n1 > n3 ) {
			System.out.println("n1 is bigger");
		}else if(n2 > n1 && n2 > n3) {
			System.out.println("n2 is bigger");
		}else if(n3 > n1 && n3 > n2) {
			System.out.println("n3 is bigger");
		}
//version 2
		int n11 = 1111;
		int n22 = 2222;
		int n33 = 3333;
			  if(n11 > n22 && n11 > n33 ) {
			System.out.println("n11 is bigger");
		}else if(n22 > n11 && n22 > n33) {
			System.out.println("n22 is bigger");
		}else if(n33 > n11 && n33 > n22) {
			System.out.println("n33 is bigger");
        }
}}