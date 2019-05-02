package day37_Array_LIST_set_add_clear_isEmpty;
import java.util.*;
public class RemoveInteger {
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>(100000000);
		System.out.println(nums.size()); //still 0
		System.out.println(nums.isEmpty()); //true
		System.out.println(nums.size() == 0); //true
		
		nums.add(11);
		nums.add(22);
		nums.add(33);
		nums.add(44);
		nums.add(55);
		nums.add(66);
		System.out.println(nums); //[11, 22, 33, 44, 55, 66]
		nums.remove(5);
		System.out.println(nums); //[11, 22, 33, 44, 55]
		
		Integer n1 = new Integer(5);
		Integer n2 = Integer.valueOf(5);
		
		nums.remove(n1);
		nums.remove(new Integer(4));
		System.out.println(nums);

}}