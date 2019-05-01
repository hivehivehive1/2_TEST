package day34_method_06_with_ReTurn_Arrays_VARARGS;
import java.util.*;
public class MainArray {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(CountArray.getArray()));
		// [45, 43, 11, 545, 1000]
		
		//store return value into array
		int[] nums = CountArray.getArray();
		System.out.println(Arrays.toString(nums));
		//[45, 43, 11, 545, 1000]
		
		
		//for(;;) { //while(true) ==> both are infinite loop 
		System.out.println(Arrays.toString(CountArray.getRandomArray(10))); //}
		
		int[] randomNums = CountArray.getRandomArray(3);
		System.out.println(Arrays.toString(randomNums));
		
}}