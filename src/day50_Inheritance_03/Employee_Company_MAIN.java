package day50_Inheritance_03;
public class Employee_Company_MAIN {

	public static void main(String[] args) {
		Employee emp = new Employee();
		Employee_FullTimeEmployee fte = new Employee_FullTimeEmployee();
		Employee_Contractro ct = new Employee_Contractro();
		
		emp.calculatePay(40, 40);
		fte.calculatePay(40, 45);
		ct.calculatePay(40, 55);

		
		
		
		
		
}}