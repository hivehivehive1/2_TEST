package day32_method_04;
import java.util.Arrays;
public class Array_Parameters {
	public static void main(String[] args) {
		int[] nums = {44, 22, 66, 11};
		printArray(nums); //can be different name
		printArray(new int[] {33, 45, 5, 7});
	//--------------	
		int[] myNums = new int[] {3,1,5,8,9,3,4,5,6};
		printArray(myNums);
	//--------------
		
//====================================================================		
		int[] a = {10, 2, 3};
		int[] b = {3, 1, 4, 323, 100};
		print2Arrays(a, b);
	//--------------	
		print2ArraysV2(a, b);
	//--------------	
		}
		public static void printArray(int[] nums) { //nums = myNums
			for(int n : nums) {
				System.out.print(n + " ");
			}
			System.out.println();
		}
//it prints the larger array followed by smaller array		
	public static void print2Arrays(int[] a, int[] b) {
		if (a.length > b.length) {
			System.out.println(Arrays.toString(a));
			System.out.println(Arrays.toString(b));
		} else {
			System.out.println(Arrays.toString(b));
			System.out.println(Arrays.toString(a));
		}
} //VERSION 2. we will call printArray method
	public static void print2ArraysV2(int[] a, int[] b) {
		if (a.length > b.length) {
			printArray(a);
			printArray(b);
		} else {
			printArray(b);
			printArray(a);
		}
}}