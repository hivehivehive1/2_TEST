package day48_Inheritance;
public class Person_Company {
public static void main(String[] args) {
System.out.println("========================= ADILET ====================");
	Person_Employee emp1 = new Person_Employee();
	emp1.name = "ADILET";
	emp1.jobTitle = "OWNER";
	emp1.gender = 'M';
	emp1.age = 36;
	emp1.work();
	emp1.eat("CRYSTAL");
	emp1.walk();
	emp1.sleep(8);
	System.out.println(emp1.toString());
System.out.println("========================= AIGUL ====================");
	Person_Employee emp2 = new Person_Employee();
	emp2.name = "AIGUL";
	emp2.jobTitle = "Manager";
	emp2.gender = 'F';
	emp2.age = 36;
	emp2.work();
	emp2.eat("GOLD");
	emp2.walk();
	emp2.sleep(12);
	System.out.println(emp2.toString());
}}