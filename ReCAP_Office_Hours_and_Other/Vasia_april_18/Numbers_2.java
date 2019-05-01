package Vasia_april_18;
import java.util.Arrays;
public class Numbers_2 {
	public static void main(String[] args) {
		int[][] nums = { {11, 22, 33, 44, 55, 66, 77, 88, 99},
						 {111, 222, 333, 444, 555, 666, 777, 888, 999},
						 {1111, 2222, 3333, 4444, 5555, 6666, -7777, -8888, -9999} };
// outer loop
// that is changing rows
		int maximum = nums[0][0];
		int minimum = nums[0][0];
		int countPositive = 0;
		int countNegative = 0;
		int total = 0;
		for (int rows = 0; rows < nums.length; rows++) {
// inner loop
// changing column
// nums[rows].length means length of specific array
// if rows = 0, then it's gone be length of 1st array
			for (int columns = 0; columns < nums[rows].length; columns++) {
				if (nums[rows][columns] > maximum) {
					maximum = nums[rows][columns];
				}
				if (nums[rows][columns] < minimum) {
					minimum = nums[rows][columns];
				}
// if number is grater than 0 - it's positive
				if (nums[rows][columns] > 0) {
					countPositive++;
// if number is less than 0 - it's negative
				} else if (nums[rows][columns] < 0) {
					countNegative++;
				}
// to find total
				total += nums[rows][columns];
			}
		}
		System.out.println("Minimum: " + minimum); //Minimum: -9999
		System.out.println("Maximum: " + maximum); //Maximum: 6666
		System.out.println("Count positive: " + countPositive); //Count positive: 24
		System.out.println("Count negative: " + countNegative); //Count negative: 3
		System.out.println("Total: " + total); //Total: 2157
}}