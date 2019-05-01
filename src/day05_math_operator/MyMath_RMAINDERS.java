package day05_math_operator;

public class MyMath_RMAINDERS {

	public static void main(String[] args) {
		int num1 = 25;
		int num2 = 4;
		
		System.out.println(num1 + num2); //29
		System.out.println(num1 - num2); //21
		System.out.println(num1 / num2); //if "double num2" will be = 6.25
		System.out.println(num1 * num2); //100
		
		System.out.println(num1 % num2); //1
		
		System.out.println(10 % 2);  //5
		System.out.println(10 % 4);  //2
		System.out.println(10 % 10); //0
		System.out.println(10 % 100000000); //10 if left more than right!
	  //System.out.println(10 % 0);  // ERROR!
		System.out.println(15 % -8); // 7
		System.out.println(-15 % 8); //-7
	}

}
