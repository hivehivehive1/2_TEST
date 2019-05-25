package day50_Inheritance_03;

public class Employee_FullTimeEmployee extends Employee {
	@Override
	public void calculatePay(int hours, double rate) {
		double total = (hours * rate) * 1.05;
		System.out.println("FullTimeEmployee total pay: " + total);
	}
}