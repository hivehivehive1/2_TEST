package OH_april_29;
import java.util.*;
public class Remove_and_Create_Array {
	public static void main(String[] args) {
//You have an array and you want to remove one element from that array 
//and create a new array without that element
		int[] nums = {1, 3, 1, 4, 1, 6};
		int removeArr = 1; // need to remove all "1s" from nums
//1) find out how many "1ns" are in nums
		int counter = 0;
//2) loop and using if condition, increase counter for each match
		for(int n : nums) {
			if(n == removeArr) {
				counter++;
			}
		}
		System.out.println("How many 1: " + counter);					//How many 1: 3
//declare new empty array with size that. 
//does not include "removeArr" count
		int[] newArrNums = new int[nums.length - counter]; //without "- counter" [0, 0, 0, 0, 0, 0]
		System.out.println(Arrays.toString(newArrNums));				//[0, 0, 0]
//loop nums one more time and add all values that are not "removeArr"
		int counter2 = 0;
		for(int n : nums) {
			if(n != removeArr) { // (!(n == removeArr)
				newArrNums[counter2] = n;
				counter2++; // add 1 so that it moves to next index
			}
		}
		System.out.println(Arrays.toString(nums));
		System.out.println(Arrays.toString(newArrNums));
System.out.println("===================");
//=================================================================================
		System.out.println(Arrays.toString(RemoveFromArray(nums, removeArr)));

		int[] nums2 = RemoveFromArray(new int[] { 3, 3, 5, 5, 6, 1, 3 }, 3);
		System.out.println(Arrays.toString(nums2));
	}
//=================================================================================
/* Method name: RemoveFromArray
 * Return type: int[]
 * Params:      int[] oldArray, int removeArr	*/
 
		public static int[] RemoveFromArray(int[] oldArray, int removeArr) {
			 
			int counter = 0;
			for(int n : oldArray) {
				if(n == removeArr) {
					counter++;
				}
			}
			int[] newArrNums = new int[oldArray.length - counter];

			int counter2 = 0;
			for(int n : oldArray) {
				if(n != removeArr) {
					newArrNums[counter2] = n;
					counter2++;
				}
			}
		return newArrNums;
		}
}