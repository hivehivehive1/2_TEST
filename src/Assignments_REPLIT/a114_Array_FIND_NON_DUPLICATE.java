package Assignments_REPLIT;
public class a114_Array_FIND_NON_DUPLICATE {
	public static void main(String[] args) {

		int[] nums = { 1, 3, 5, 7, 5, 3, 1 };

		for (int i = 0; i < nums.length; i++) {
			int n = 0;
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					n++;
				}
			}
			if (n < 2) {
				System.out.println(n);
			}
		}
	}
}