package _TEMP;
import java.util.ArrayList;
import java.util.Arrays;

public class TEMP_3 {
	public static void main(String[] args) {
System.out.println("\n============================= REV My Name ===================================");			
		String nameRev = "Adilet S.";
		String reversed = new StringBuilder(nameRev).reverse().toString();
		System.out.println("Adilet S. | " + reversed);
System.out.println("============================== REV with while =================================");
		String hello = "Hello";
		int a = hello.length() -1;
		String rev = "";
		while(a >= 0) {
			rev += hello.charAt(a);
			a--;
		} System.out.println(rev); // Hello => olleH
System.out.println("=========================== replace with while =================================");
		String replace = "123 hive 123";
		while (replace.contains("hive")) {	
			replace = replace.replace("hive", "hello");
		}
		System.out.print(replace); // hive => hello
System.out.println("\n============================= print A > Z ====================================");		
		char printAZ = 'a';
		while (printAZ <= 'z') {
			System.out.print(printAZ + ". ");
			printAZ++;	
		}
System.out.println("\n============================= print Z > A ====================================");	
		char printZA = 'z';
		while (printZA >= 'a') {
			System.out.print(printZA + ". ");
			printZA--;	
		}		
System.out.println("\n============================= Small number ===================================");
		int[] nMin = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 99 };
		int min = 100;
		for (int i = 0; i < nMin.length; i++) {
			if (nMin[i] < min) {
				min = nMin[i];
			}
		}
		System.out.println(min);
System.out.println("============================== Large number ====================================");
		int[] nMax = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 99 };
		int max = 0;
		for (int i = 1; i < nMax.length; i++) {
			if (nMax[i] > min) {
				min = nMax[i];
			}
		}
		System.out.println(min);
System.out.println("=============================== 1 > 20 =========================================");
		for (int i = 1; i <= 20; i++) {
			System.out.print(i + ", ");
		}
System.out.println("\n=================== Division without Divide or Mod ===========================");
		int divident = 100;
		int divisor = 2;
		int count = 0;
		while (divident >= divisor) {
			divident = divident - divisor;
			count++;
		}
		System.out.println("quotient = " + count);
		
System.out.println("====================== ABC and 123 to A1B2C3 ===================================");
		String a1 = "ABC";
		String b1 = "123";
		// a1b2c3
		String ab = "";
		for (int i = 0; i < a1.length(); i++) {
			ab += a1.substring(i, i + 1) + b1.substring(i, i + 1);
		}
		System.out.println(ab);
System.out.println("============================== DEL 1s ==========================================");
		int[] a2 = { 1, 1, 1, 2, 3, 4 };
		int count2 = 0;
		for (int i = 0; i < a2.length; i++) {
			if (a2[i] == 1) {
				count2++;
			}
		}
		int[] b = new int[a2.length - count2];
		int bb = -1;
		System.out.println(Arrays.toString(b));
		for (int ii = 0; ii < b.length; ii++) {
			for (int i = bb + 1; i < a2.length; i++) {
				if (a2[i] != 1) {
					b[ii] = a2[i];
					bb = i;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(b));
System.out.println("=============================== DEL all 1s === 1,1,2,3,4 to 2,3,4 ==============");
		ArrayList<Integer> r = new ArrayList<>();
		Integer[] nums = new Integer[] { 1, 1, 2, 3, 4 };
		r.addAll(Arrays.asList(nums));
		Integer n = 1;

		for (int i = 0; i < r.size(); i++) {
			if (r.get(i) == n) {
				r.remove(n);
				i--;
			}
		}
		System.out.println(r);
System.out.println("=========================================== Double nums ========================");
		ArrayList<Integer> aaa = new ArrayList<Integer>();
		Integer[] dd = { 1, 2, 3, 4 };
		aaa.addAll(Arrays.asList(dd));
		ArrayList<Integer> tT = new ArrayList<Integer>();
		for (int i = 0; i < aaa.size(); i++) {
			tT.add(aaa.get(i));
			tT.add(aaa.get(i));
		}
		System.out.println(tT);
System.out.println("================================================================================");	
			
			
			
				
			
				
			
			
			
			
			
		
		

}}