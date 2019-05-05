package Vasia_may_02;
import java.util.ArrayList;
import java.util.Arrays;
public class ArrayListPractic {
	public static void main(String[] args) {
        int[] nums = new int[5];
        nums[4] = 66;
        System.out.println(Arrays.toString(nums));
        ArrayList<Integer> nums2 = new ArrayList<>();
        nums2.add(11);
        nums2.add(22);
        nums2.add(33);
        nums2.add(44);
        nums2.add(0, 66);//2 means position, 65 value that will be under this position
        System.out.println(nums2);
        System.out.println("How many elemnts in array list? " + nums2.size());
//auto boxing helps us to convert primitive into object
//if we enter number into remove() method, it will treat this number as index (position)
        Integer numToDelete = 66;
        nums2.remove(numToDelete);
        System.out.println(nums2);
}}