package day24_ARRAYS;
import java.util.Arrays;
public class SumOfTheNumbers {
	public static void main(String[] args) {
		//create an array of INTEGERS with length 3
		int[] numbers = new int[3];
		//first value in array
		numbers[0] = 5;
		//second 
		numbers[1] = 10;
		numbers[2] = 20;		//from array to string print
		System.out.println(Arrays.toString(numbers)); //[5, 10, 20]
		int sum = 0;
		for(int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		System.out.println("Sum is " + sum); //35
//--------------------------------------------------------------------		
	//find largest value in the array
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] > max) {
				max = numbers[i];
			}
		}
		System.out.println("Max value: " + max); //20 max from [5,10,20]
//--------------------------------------------------------------------		
	//Find min valuein array
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] < min) {
				min = numbers[i];
			}
		}
		System.out.println("Max value: " + min); //5 min from [5,10,20]
}}