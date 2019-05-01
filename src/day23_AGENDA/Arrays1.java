package day23_AGENDA;
public class Arrays1 {
	public static void main(String[] args) {
		int[] numbers = new int[3];
		int num1 = 1;
		int num2 = 5;
		int num3 = 9;
		//assign to the first element in the array value of num1
		numbers[0] = num1;
		numbers[1] = num2;
		numbers[2] = num3; //numbers[2] = "A"; we cannot
						   //numbers[2] = 'A'; //65
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println("********");
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		String[] names = new String[5];
		String[] name2 = {"Adik", "Urma", "JINKA", "Putin", "SUCHKA"};
		
		System.out.println(name2[2]);
		System.out.println("Number of items: " + name2.length);
		String[] countries = { "" };
//		double[] values = 
//		ARRAY HAS FIXED SIZE
		countries[0] = "USA";
//		String name = null;
		String[] fruits = new String[] {"apples", "orange"};
		//for each loop stands for collections of data
		//we need specify data type, variable name: out collection of data
		for(String fruit: fruits) {
			System.out.println(fruit);
		}
}}