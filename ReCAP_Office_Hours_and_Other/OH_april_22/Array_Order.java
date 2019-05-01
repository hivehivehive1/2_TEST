package OH_april_22;
public class Array_Order {
	public static void main(String[] args) {
		int[] nums = new int[] { 1, 1, 4, 6, 7, 12 };
		int[] nums2 = new int[] { 1, 4, 6, 3, 7, 12 };
		int[] nums3 = new int[] { 433, 12, 5 };
		isArraySorted(nums);
		isArraySorted(nums2);
		isArraySorted(nums3);
	}
	public static void isArraySorted(int[] nums) {
		/*
		 * Method accepts array of ints
		 */
		boolean sorted = true;

		for (int i = 0; i < nums.length - 1; i++) {
			System.out.println(nums[i] + " " + nums[i + 1]);
			if (nums[i] > nums[i + 1]) {
				sorted = false;
				break;
			}
		}
		System.out.println("Array is sorted?- " + sorted);
}}