package day11_LOGICAL_Nestedif;
public class TruthTables {
	public static void main(String[] args) {
		System.out.println("###TRUTH TABLE FOR && OPERATOR ###");
		System.out.println("When true && true - result is " + (true && true));   //true
		System.out.println("When true && false - res is " +(true && false));	 //false	
		System.out.println("When false && true - res is " + (false && true));    //false
		System.out.println("When false && false - res is " + (false && false));  //false
		
		System.out.println(""); //add an empty line
		
		System.out.println("###TRUTH TABLE FOR || OPERATOR ###");
		System.out.println("When true || true - res is " + (true || true));		//true
		System.out.println("When true || false - res is " + (true || false));	//true
		System.out.println("When false || true - res is " + (false || true));	//true
		System.out.println("When false || false - res is " + (false || false) + "\n"); //false
			
		System.out.println("###TRUTH TABLE FOR !(NOT) OPERATOR ###");
		System.out.println("When !true - res is " + (!true));			//true
		System.out.println("When !false - res is " + (!false));			//false
}}