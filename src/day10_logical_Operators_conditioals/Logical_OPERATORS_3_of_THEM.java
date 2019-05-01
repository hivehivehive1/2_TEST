package day10_logical_Operators_conditioals;
public class Logical_OPERATORS_3_of_THEM {
	public static void main(String[] args) {
		//AND (&&) ampersand
		//OR  (||) pipe
		//NOT (!) Exclamation mark
		
	//(&&) = IPhone && MacPro (condition1 && condition2) both
	//(||) = IPhone || MacPro (condition1 || condition2) 1 of this
	//  	   true OR true = true
	//	      false OR true = true
	//	      false OR false = false	
	//(!) = IPhone (!) true>false, false>true. REVERSES THE BOOLEAN VALUE
		
		boolean isNiceWather = true;
		int hourlyRate = 50;
		if(hourlyRate > 40) {
			System.out.println("too low");
		}else {
			System.out.println("rate is good");
		}
		
		if(!isNiceWather) {
			System.out.println("Don't go");
		}else {
			System.out.println("Go");
}}}