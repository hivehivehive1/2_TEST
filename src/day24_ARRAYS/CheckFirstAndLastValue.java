package day24_ARRAYS;
public class CheckFirstAndLastValue {
	public static void main(String[] args) {
		//if first and last value in the array of int's are same - print true
		int[] numbers = {12,41,213,21,42,12};
		boolean equals = numbers[0] == numbers[numbers.length - 1];
		System.out.println(equals); //true
//------------------------------------------------------------------------------		
		System.out.println(numbers[0] == numbers[numbers.length -1]); //true
//------------------------------------------------------------------------------
		if(numbers[0] == numbers[numbers.length - 1]) {
			System.out.println(true); //true
		}else {
			System.out.println(false);
		}
}}
