package day27_Arrays;
import java.util.*;
public class CopyOF_2 {
	public static void main(String[] args) {
		int[] nums1 = {34, 56, 23, 1, 55};
		int[] nums2 = Arrays.copyOf(nums1, nums1.length + 5);
		int[] nums3 = Arrays.copyOfRange(nums1, 1, 3);
		System.out.println("Nums3: " + Arrays.toString(nums3)); //Nums3: [56, 23]
		
		System.out.println(Arrays.toString(nums2)); //[34, 56, 23, 1, 55, 0, 0, 0, 0, 0]
		nums2[5] = 100;
		nums2[6] = 200;
		nums2[7] = 300;
		System.out.println(Arrays.toString(nums2)); //[34, 56, 23, 1, 55, 100, 200, 300, 0, 0]
		
		int[] new2 = {34, 23, 54, 23};
		new2 = Arrays.copyOf(new2, new2.length + 5);
		
		System.out.println("Length after: " + new2.length); //Length after: 9
	}

}
