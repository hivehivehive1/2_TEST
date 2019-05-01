package OH_april_17;
import java.util.Arrays;
public class Int_Array {
	public static void main(String[] args) {
		int[] nums = {30,20,10,15,25};
		System.out.println(Arrays.toString(nums));
		//print everything using for each loop
		for(int n : nums) {
			if(n > 17) {
			   System.out.println(n);
			}
		}
		//calculate sum using for loop
		int sum = 0;
		for(int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		System.out.println("Sum: " + sum);
		
		//print middle number
		int m = nums[nums.length/2];
		int l = nums[nums.length-1];
		
		System.out.println("m:" + m +" | l:" + l  );
		
		//find the lowest
		//assign first number then compare in the loop/
		int lowest = nums[0]; //30. 
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] < lowest) {
				lowest = nums[i];
			}
		}
		
		System.out.println("Lowest num:" + lowest);
		int max = nums[0];
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] > max) {
				max = nums[i];
			}
		}
		System.out.println("Max:" + max);
}}