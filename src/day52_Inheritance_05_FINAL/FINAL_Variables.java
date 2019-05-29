package day52_Inheritance_05_FINAL;
public class FINAL_Variables {
	
	public final int ROADSTER_MAX_RANGE=610;
	public final int MODEL_3_MAX_SPEED;
	public final int MODEX_X_PASSENGERS;
	public final String JAN = "January";
	
	public static final String COMPANY_NAME = "Cybertek";
	public static final String ADMIN_USERNAME;
	
	static{
		ADMIN_USERNAME = "admin@gmail.com";
	}
	
	public FINAL_Variables() {
		MODEL_3_MAX_SPEED = 190;
		
	}
	/*
		public FinalVariables(int num) {
			MODEL_3_MAX_SPEED = num;
		}
	*/
	{
		MODEX_X_PASSENGERS = 7;
	}
	
	public static void main(String[] args) {
		final int MAX_PASSENGERS_COUNT = 5;
		//MAX_PASSENGERS_COUNT = 10;
		final double PI = 3.14159265358979323846;
		//PI = 4.667885432;
		System.out.println(MAX_PASSENGERS_COUNT);
		
		final int SSN;
		//code
		SSN = 314569841;
		//SSN++; is not possible.
		FINAL_Variables finalVars = new FINAL_Variables();
		System.out.println("Max range for roadster: " + finalVars.ROADSTER_MAX_RANGE);
		System.out.println("Model 3 max speed: " + finalVars.MODEL_3_MAX_SPEED);
		System.out.println("Model X passengers: " + finalVars.MODEX_X_PASSENGERS);
		System.out.println(Integer.MAX_VALUE);
		
		System.out.println("Company name: " + COMPANY_NAME);
		System.out.println("Company name: " + FINAL_Variables.COMPANY_NAME);
		System.out.println("Admin: " + ADMIN_USERNAME);
		
}}