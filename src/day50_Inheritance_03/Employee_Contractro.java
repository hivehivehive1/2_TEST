package day50_Inheritance_03;

public class Employee_Contractro extends Employee {
	@Override
	public void calculatePay(int hours, double rate) {
		double total = hours * rate + 200;
		System.out.println("Contractor total pay: " + total);
	}
	
	
	
	
}