package _TEMP;
public class TEMP_3 {
	public static void main(String[] args) {
System.out.println("============================== REV with while =================================");
		String hello = "Hello";
		int a = hello.length() -1;
		String rev = "";
		while(a >= 0) {
			rev += hello.charAt(a);
			a--;
		} System.out.println(rev); // Hello => olleH
System.out.println("=========================== replace with while ================================");
		String replace = "123 hive 123";
		while (replace.contains("hive")) {
			replace = replace.replace("hive", "hello");
		}
		System.out.print(replace); // hive => hello
System.out.println("\n============================= print A > Z ===================================");		
		char printAZ = 'a';
		while (printAZ <= 'z') {
			System.out.print(printAZ + ". ");
			printAZ++;	
		}
System.out.println("\n============================= print Z > A ===================================");	
		char printZA = 'z';
		while (printZA >= 'a') {
			System.out.print(printZA + ". ");
			printZA--;	
		}		
System.out.println("\n============================== small number =================================");
		int[] nMin = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 99 };
		int min = 100;
		for (int i = 0; i < nMin.length; i++) {
			if (nMin[i] < min) {
				min = nMin[i];
			}
		}
		System.out.println(min);
System.out.println("============================== large number ===================================");
		int[] nMax = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 99 };
		int max = 0;
		for (int i = 1; i < nMax.length; i++) {
			if (nMax[i] > min) {
				min = nMax[i];
			}
		}
		System.out.println(min);
System.out.println("=============================== 1 > 20 ========================================");
for(int i = 1; i <= 20; i++) {
	System.out.print(i + ", ");
}		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		

}}