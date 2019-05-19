package day47_blocks;
public class variableAccess {
//instance variable	
	int myInstaceVar = 40;
//static variable
	static int myStaticVar = 55;
	
	
	public static void main(String[] args) {
	//	System.out.println(myInstaceVar); //Can'n access non-static from static method
		System.out.println(myStaticVar);
//create object of VariableAccess and print myInstaceVar
		variableAccess v = new variableAccess();
		System.out.println(v.myInstaceVar);
//access static variable using object
		System.out.println(v.myStaticVar);
//access static variable using classname
		
		
		
		
		
		
		

}}