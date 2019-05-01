package Vasia_april_25;
public class Find_MIN_MAX_Numbers_in_ARR {
	public static void main(String[] args) {
		int[] numbers = { 421, 235, 435, 64, 547, 63, 54, 845, 4 };

		int min = findMin(numbers);
		System.out.println(min);

		int max = findMax(numbers);
		System.out.println(max);
	}
	public static int findMin(int[] arr) {
		int min = arr[0];
		for (int i : arr) {
			if (i < min) {
				min = i;
			}
		}
		return min;
	}
	public static int findMax(int[] arr) {
		int max = arr[0];
		for (int i : arr) {
			if (i > max) {
				max = i;
			}
		}
		return max;
}}