package day04_Math_Operator;

public class UsingVariables {

	public static void main(String[] args) {
		//declare int variables num2, num3, num4
		int num1, num2, num3;
		// assign 100 to num1
		// assign values of num1 to num2
		//Print num and num2 values in separate lines
		
		num1 = 100;
		num2 = num1;
		System.out.println(num1);
		System.out.println(num2);
		
		num2 = 200;
		num1 = num2;
		num3 = num1;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
		//declare apples and assign 25
		int apples = 25;
		//declare kiwis and assign values off apples to it
		int kiwis = apples;
		//declare mangoes and 55
		int mangos = 55;
		//assign mangos to kiwis
		kiwis = mangos;
		
		System.out.println(apples); //25
		System.out.println(kiwis);  //55
		System.out.println(mangos); //55
	}

}
