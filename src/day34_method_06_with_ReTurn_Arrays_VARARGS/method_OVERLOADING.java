package day34_method_06_with_ReTurn_Arrays_VARARGS;
public class method_OVERLOADING {
	public static void main(String[] args) {
		add(10, 20);
		add(10.0, 20);
		add("one", "two");
		
	}
	public static void add(int num1, int num2) {
		int result = num1 + num2;
		System.out.println("Result: " + result);		//Result: 30
	}
	public static void add(double num1, double num2) {
		double result = num1 + num2;
		System.out.println("Result: " + result);		//Result: 30.0
	}
	public static void add(String num1, String num2) {
		String result = num1 + num2;
		System.out.println("Result: " + result);		//Result: onetwo
	}
}