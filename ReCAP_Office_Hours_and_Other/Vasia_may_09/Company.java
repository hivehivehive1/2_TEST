package Vasia_may_09;
public class Company {
	public static void main(String[] args) {

		// first employee
		Employee employee1 = new Employee();
		employee1.firstName = "ADIK";
		employee1.lastName = "OROZBAEV";
		employee1.printInfo();

		// second employee
		Employee employee2 = new Employee();
		employee2.firstName = "URMA";

		employee1.generateEmail();
		employee1.printEmail();
		employee1.setEmail("324234@");
		employee1.email = "newemail@gmail.com";
		employee1.title = "developer";
		employee1.setJobTitle("Carwasher");
		employee1.printInfo();
	}
}

// Employee[] it_department = new Employee[2];
// type[] name = new type[size];
// Employee[] it_department = { employee1, employee2 };