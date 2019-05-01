package day10_logical_Operators_conditioals;
public class IF_statementWithBooleanVariables {
	public static void main(String[] args) {
		boolean isBreakTime = true;
		if(isBreakTime == true) {
			System.out.println("BREAK TILL 8:35 PM");
		}else {
			System.out.println("Not Break time yeat.");
		}
//second version
		if(isBreakTime) { // can be without == true!  =>boolean
			System.out.println("BREAK TILL 8:35 PM");
		}else {
			System.out.println("Not Break time yeat.");
		}
		
		boolean classTime = false;
		if(classTime == false) { //this true!
			System.out.println("Come back on time");
		}else {
			System.out.println("Take a walk and have some water.");
		}
//=========		
		boolean qualified = false;
		// send a notification message if not qualified
		// we need to check if qualified variable contains FALSE
		if(qualified == false) {  //true   //just checking condition
			System.out.println("Your application was not approved");
//=========
}}}