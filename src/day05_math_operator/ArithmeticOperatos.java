package day05_math_operator;

public class ArithmeticOperatos {

	public static void main(String[] args) {
		System.out.println(55 + 5);
		
		int chairs = 140;
		System.out.println(chairs + 2);
		
		int moreChairs = chairs + 5;
		System.out.println(moreChairs);
		
		int tables = 130;
		int total = tables + chairs;
		System.out.println(total);
		
		System.out.println(500-123);
		int result = 44-23;
		System.out.println(result);
		
		double balance = 1200.50;
		double transaction = 56.44;
		System.out.println(balance - transaction);
		balance = balance - transaction;
		
		//create a variable linesOfCode and assign 50
		//you deleted 2 lines
		//decrease the value of linesOfCode by 2 and print "Lines of code48"
		
		int linesOfCode = 50;
		System.out.println("Lines of code " + linesOfCode);
		linesOfCode = linesOfCode - 2;
		System.out.println("lines of code "+linesOfCode);
		
		//multiplication *
		System.out.println(22 * 2);
		
		//declare variable classes and assign 5
		int classes = 5;
		System.out.println(linesOfCode * classes);
		
		int totalLinesofCode = linesOfCode * classes;
		System.out.println("total lines of code="+totalLinesofCode);
		
		//Division operator / 
		System.out.println(10 / 3); //3
		System.out.println(55.5 / 5); //11.1
		System.out.println(15 / 7); //2
		System.out.println(15.0 / 7); //2.1
		System.out.println(15 / 7.0); //2.1
	//	System.out.println(11 / 0); //ERROR!!!!!!!!!!!!!!!
		
		
		
	} 

}
