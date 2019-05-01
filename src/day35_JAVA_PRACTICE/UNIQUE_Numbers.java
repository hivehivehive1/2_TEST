package day35_JAVA_PRACTICE;
import java.util.*;
public class UNIQUE_Numbers {
	public static void main(String[] args) {
//int[] array and we need to print unique numbers
//		1)in main method
//		2)void method that accepts an array
//		3)method that accepts int[] and returns int[] with unique values
//===========================================================================================
		int[] nums = { 7, 4, 1, 4, 1, 5, 9, 9, 3 };
		System.out.println(Arrays.toString(nums));
		for (int i = 0; i < nums.length; i++) {
			int uniq = 0;
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] == nums[j] && i != j) {
					uniq++;
				}
			}
			if (uniq == 0) {
				System.out.print(nums[i] + ", ");
			}
		}
System.out.println();
//2nd VERSION ==================================================================================
		int[] nums2 = { 7, 4, 1, 4, 1, 5, 9, 9, 3 };
		for (int i = 0; i < nums2.length; i++) {
			int temp = nums2[i]; // get a number
			int counter = 0;
			for (int j = 0; j < nums2.length; j++) {
				if (nums2[j] == temp && i != j) {
					counter++;
					break;
				}
			}
			if (counter == 0) {// is it still 0. then it is unique
				System.out.print(temp + ", ");
			}
		}
}}