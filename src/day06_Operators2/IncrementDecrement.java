package day06_Operators2;

public class IncrementDecrement {

	public static void main(String[] args) {
		int employees = 50;
		System.out.println("Employees: " + employees);
		
		employees++;
		employees++; //add again +1
		employees += 1;
		employees = employees + 1; //+1
		System.out.println("Employees: " + employees);
		
		employees--; //decrease by 1
		--employees; //- 1
		System.out.println("Employees: " + employees);
		
		int apples = 5;
		apples = apples + 1;
		apples += 1;
		apples ++;
		//1+1+1
		System.out.println(apples);
		

	}

}
