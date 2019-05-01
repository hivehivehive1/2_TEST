package day27_Arrays;
import java.util.Arrays;
public class BinarySearch {
	public static void main(String[] args) {
		int[] nums = {1, 22, 33, 4, 55};
		System.out.println(Arrays.binarySearch(nums, 55));//4
		System.out.println(Arrays.binarySearch(nums, 33));//2
		
		int i = Arrays.binarySearch(nums, 55);
		System.out.println(i);
		
		int[] nums2 = {111, 222, 333, 44, 55};
		Arrays.sort(nums2);
		System.out.println(Arrays.toString(nums2));         //[44, 55, 111, 222, 333]
		System.out.println(Arrays.binarySearch(nums2, 55)); //1

}}