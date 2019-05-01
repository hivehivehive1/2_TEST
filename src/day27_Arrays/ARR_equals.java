package day27_Arrays;
import java.util.*;
public class ARR_equals {
	public static void main(String[] args) {
		int[] nums1 = {4, 5, 6, 10, 100};
		int[] nums2 = {4, 5, 6, 10, 100};
		System.out.println(Arrays.equals(nums1, nums2));
		
		if(Arrays.equals(nums1, nums2)) {
			System.out.println("They are exactly same");
		}else {
			System.out.println("Mismatched values present");
		}
System.out.println("**************************************************");		
		String[] strArr1 = {"one", "two", "three"};
		String[] strArr2 = {"one", "Two", "three"};
		
		System.out.println(Arrays.equals(strArr1, strArr2));
		
		boolean match = Arrays.equals(strArr1, strArr2); //false
		
		System.out.println("Matchs: " + match); //false
		//will not work, you can only campare same 
		//Arrays.equals(str1, nums2);
}}