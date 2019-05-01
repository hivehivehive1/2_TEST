package day34_method_06_with_ReTurn_Arrays_VARARGS;
import java.util.*;
public class CountArray {
	public static void main(String[] args) {
		int[]nums = {2,3,4,5,5,6,6,6,7,5,5,12};
	//1. with Print return right away
		System.out.println(findOccurences(nums, 5)); //4
		System.out.println(findOccurences(nums, 6)); //3
	//2. assign return value into a variable
		int five = findOccurences(nums, 5);
		System.out.println("5 values: " + five); //5 values: 4
		if(five > 0) {
			System.out.println("We have 5s"); //We have 5s
		}else {
			System.out.println("No 5s");
		}
		if(findOccurences(nums, 2) > 0) {
			System.out.println("We have 2"); //We have 2
		}else {
			System.out.println("No 2s");
		}
		//creat array and pass to method
		int twenty = findOccurences(new int[] {10,20,20,30,55,22}, 20);
		System.out.println("twenty: " + twenty);
		
		
		
	}
/*1)Class: CountArray
	Method: findOccurences
	Return type: int
	Params: int[] array, int value
	Method will look for value in the array and return the count of occurences
*/	
		public static int findOccurences(int[]array, int value) {
			int counter = 0;
			for(int num : array) {
				if(num == value) {
				counter++;
			}
		}
			return counter;
}
/*2)Method name: get Array
 *	return type: int[]
 *	No params:
 *	In the method, build array and assign value then return it.		
*/	
		public static int[] getArray() {
			int[] returnArray = {45, 43, 11, 545, 1000};
			return returnArray;
		}
/*3)Method name: getRandomArray
 * 	Return type: int[]
 * 	Params: int size
 *  Int the method create an array with value of size. and assign random values from 0-100 and retun it.	
 */
		public static int[]	getRandomArray (int size) {
			Random random = new Random(); //creat Random class object
			int[] nums = new int[size];   //declare array with size number of elems
			for(int i = 0; i < size; i++) {
				nums[i] = random.nextInt(100); //get random numbers and assing to array
			}
			return nums;
			
		}
			
			
}