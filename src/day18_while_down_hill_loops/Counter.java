package day18_while_down_hill_loops;
public class Counter {
	public static void main(String[] args) throws InterruptedException {
		// 1.2.3.4.5.6.7.8.9.10
		int num = 1;
		while(num <= 10) {
			System.out.print(num + ". ");
			num++;
			Thread.sleep(300); //pause the code execution for a second
		}
		System.out.println("\n Num value after loop: " + num);

		//11,10,9,8,7,6,5,4,3,2,1
		int num2 = 10;
		while(num2 > 0) {
			System.out.print(num2 + ". ");
			num2--;
			Thread.sleep(300);
		}
		System.out.println("\n Num value after loop: " + num2);
}}