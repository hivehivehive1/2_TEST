package day33_method_05_with_ReTurn_value;
public class CalcTest {
	public static void main(String[] args) {
		System.out.println(Calculator.add(3, 1));
		System.out.println(Calculator.minus(40, 12));
		System.out.println(Calculator.multiply(5, 6));
		System.out.println(Calculator.divide(100, 2));
		System.out.println(Calculator.add(3, 1) + Calculator.minus(5, 1));
		
		int addResult = Calculator.add(21, 41);
		double multResult = Calculator.multiply(50, 40);
		double minResult = Calculator.minus(300, 200);
		double divResult = Calculator.divide(455, 5);
		
		System.out.println("addResult: " + addResult);
		System.out.println("multResult: " + multResult);
		System.out.println("minResult: " + minResult);
		System.out.println("divResult: " + divResult);
		
		double a1 = 10.0, b1 = 5.0;
		double myResult = Calculator.minus(a1, b1);
		System.out.println("muResult: " + myResult);
		
		double[] dNums = {2.0, 4.0};
		double result2 = Calculator.multiply(dNums[0], dNums[1]);
		System.out.println("result2: " + result2);
		
		if(Calculator.add(10, 16) == 26) {
			System.out.println("Add Unit Test Passed");
		}else {
			System.out.println("Add Unit Test Faild");
		}
		String str = "java";
		if(str.length() == 4) {
			System.out.println("It's 4 chars");
		}else {
			System.out.println("It's NOT 4 chars");
		}
		
		
		
}}
