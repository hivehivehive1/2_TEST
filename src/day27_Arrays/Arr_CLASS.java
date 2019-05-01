package day27_Arrays;
import java.util.Arrays;
public class Arr_CLASS {
	public static void main(String[] args) {
		int[] nums = {43, 12, 4, 1, 3, 5};
		//toString method
		Arrays.toString(nums);
		System.out.println(Arrays.toString(nums)); //[43, 12, 4, 1, 3, 5]
		String str = Arrays.toString(nums);
		System.out.println(str); 				   //[43, 12, 4, 1, 3, 5]
		//sort method. sorts array in ascending order
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums)); //[1, 3, 4, 5, 12, 43]
								//1. NUMBERS 2. UPPerCase 3. LOWerCase
		String[] languages = {"Russian", "Kyrgyz", "English", "Zulu", "PoPonyatiam"};
		System.out.println(Arrays.toString(languages));//[Russian, Kyrgyz, English, Zulu, PoPonyatiam]
		Arrays.sort(languages);
		System.out.println(Arrays.toString(languages));//[English, Kyrgyz, PoPonyatiam, Russian, Zulu]
		
		int[] win = {1, 10, 11, 5, 6, 100000000};
		//find lowest and largest value from nums2 array
		System.out.println(Arrays.toString(win)); //[1, 10, 11, 5, 6, 100000000]
		Arrays.sort(win);
		System.out.println(Arrays.toString(win)); //[1, 5, 6, 10, 11, 100000000]
		
		int lowest = win[0];
		int largest = win[win.length -1];
		System.out.println("Lowest number: " + lowest);   //Lowest number: 1
		System.out.println("Largest Number: " + largest); //Largest Number: 100000000
}}
