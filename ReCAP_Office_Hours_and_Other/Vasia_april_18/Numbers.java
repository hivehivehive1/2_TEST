package Vasia_april_18;
import java.util.Arrays;
public class Numbers {
	public static void main(String[] args) {
		int[] nums = { 123, 532, 34, 643, -345, 73, 436, 344362, 547 };
		//get 2 element from array
		System.out.println(nums[1]);
		nums[1] = 5;
		System.out.println(Arrays.toString(nums));
		int max = nums[0]; 
		int min = nums[0];
		int counter = 0;
		for(int num: nums) {
			System.out.println("Checking "+counter+" value from array...");
			System.out.println("Does "+num+" is grater than  current max "+max+" or not?");
			if(num> max) {
				max = num;
			}
			System.out.println("Does "+num+" is less than  current min "+min+" or not?");
			if(num<min) {
				min = num;
			}
			System.out.println();
			counter++;
		}
		System.out.println("Maximum: "+max);
		System.out.println("Minimum: "+min);
}}