package day07_Scanner;

public class Comparison_Relatinal_Operatos {

	public static void main(String[] args) {
		// =  - assignment operator
		// == - equals
		// != - not equals
		// >  - great than
		// >= - great than or equals
		// <  - less than
		// <= - less than or equal
		System.out.println(5 == 5); //true
		System.out.println(50 == 5); //false
		int searchCount = 5000;
		System.out.println(searchCount == 5000); //true
		int expectedCount = 5010;
								//5000  =  5010
		System.out.println(searchCount == expectedCount); //false
				
		int speedLimit = 55;
		int currentSpeed = 75;
		System.out.println(currentSpeed == speedLimit); //false
		
		boolean atLimit = currentSpeed == speedLimit;
		System.out.println("At Speed Limit: " + atLimit); //false
		
		boolean overLimit = currentSpeed > speedLimit;
		System.out.println("Over speed limit: " + overLimit); //true
		
		boolean underLimit = currentSpeed < speedLimit;
		System.out.println("Under limit: " + underLimit); //false
		
		double balance = 150.0;
		boolean broke = balance <= 0.0;
		System.out.println("Broke? - " + broke); //false
		
		double transaction = 155.5;
		broke = (balance  - transaction) <0;
		System.out.println("Will make broke/negative? - " + broke); //true
		System.out.println("Balance: " + balance); //150.0
		System.out.println("Transaction: " + transaction); //155.5
		
		
	}

}
