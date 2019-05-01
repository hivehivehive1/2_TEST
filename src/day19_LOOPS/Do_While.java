package day19_LOOPS;
public class Do_While {
	public static void main(String[] args) {
		//print 1 to 10 using DO WHILE loop
		int i = 1;
		do {
			System.out.println(i);
			i++;
		}while(i <= 5);
//----------------------------------------------------------		
		//write a do while loop to calculate sum of numbers
		//between 1 to 5
		//1+2+3+4+5+ ==> 15
		int sum = 0;
		int j = 1;
		do {
			sum = sum + j; //sum += j;
			j++;
		}while(j <= 5); //check the condition on the bottom
		
		System.out.println("\n Sum from 1 to 5 is " + sum);
}}