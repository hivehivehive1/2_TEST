package day33_method_05_with_ReTurn_value;
public class Calculator {
	public static void main(String[] args) {
//-------1		
		addVoid(10, 20);
//-------2
		double sum2 = add(30, 40);
		System.out.println("Sum2: 30 + 40 = " + sum2);
//-------3		
		String word = str("A", "B");
		System.out.println(word + " = C");
//-------4		
		double multi = multiply(5, 5);
		System.out.println("Multiply: 5 x 5 = " + multi);
//-------5
		double divi = divide(25, 5);
		System.out.println("Divide: 25 / 5 = " + divi);
//-------6
		double minus = minus(10, 5);
		System.out.println("Minus: 10 - 5 = " + minus);
	}
		public static void addVoid(int num1, int num2) {
			int sum1 = num1 + num2;
			System.out.println("Sum1: 10 + 20 = " + sum1);
		}
		public static int add(int num1, int num2) {
			int sum2 = num1 + num2;
			return sum2;
		}
		public static String str(String str1, String str2) {
			String word = str1 + " + " + str2;
			return word;
		}
		public static double multiply(double a, double b) {
			return a * b;
		}
		public static double divide(double a, double b) {
			if(a == 0) {
				System.out.println("ERROR: Can't '/' by 0");
				return 0;
			}else {
				return a / b;
			}
		}
		public static double minus(double a, double b) {
			return a - b;
		}
}