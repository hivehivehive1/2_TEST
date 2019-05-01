package day24_ARRAYS;
import java.util.Arrays;
public class CarShop {
	public static void main(String[] args) {
// 1. Step: Create an array of strings, and store these cars inside that array		
		String[] cars = {"BMW", "Audi", "Mercedas", "Rolls-Royce", "Bennttly", "Tesla", "Toyota", "ZIL", "VAZ"};
// 2. Step: Print car names that start with "M"		
		for (String m: cars) {
			if(!m.startsWith("M")) {
				continue;
			}
			System.out.println(m); //Mercedas
}System.out.println("=======================================================================");
// 3 Step: Print all cars that have letter "R" somewhere in the name
		for(String r : cars) {
			if(r.toLowerCase().contains("r")) {
				System.out.println(r); //Mercedas, Rolls-Royce
}}System.out.println("=======================================================================");
// 4 Step: Print car name that ends with "A"
		for(String a : cars) {
			if(a.toLowerCase().endsWith("a")) {
				System.out.println(a); //Toyota, Tesla
}}System.out.println("=======================================================================");
// 5 Step: Print all cars that have at least 6 letters
		for(String six : cars) {
			if(six.length() > 6) {
				System.out.println(six); //Mercedas, Rolls-Royce, Bennttly
			}
		}
//		String six2 = "";
//		for(int i = 0; i < six2.length; i++) {
//			String six2 = cars[i];
//			if(six2.length() >= 6) {
//				System.out.println(six2);
//			}
//		}
System.out.println("=======================================================================");
// 6 Step: Before BMW
//         After  VAZ
// Swap first and last value in the array
		String temp = cars[0];
		cars[0] = cars[cars.length - 1];
		cars[cars.length - 1] = temp;
		System.out.println(Arrays.toString(cars)); //VAZ BMW	
System.out.println("=======================================================================");
//--------------SORTING----------------------------------
		System.out.println("                        Before sorting");
        System.out.println(Arrays.toString(cars));
        Arrays.sort(cars);
        System.out.println("                         After sorting");
        System.out.println(Arrays.toString(cars));
}}