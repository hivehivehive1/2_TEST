package day39_arraylist_04;
import java.util.*;
public class Unique_Values_2ways {
	public static void main(String[] args) {
// Get Uniq values from arraylist
		List<Integer> nums = new ArrayList<>();
nums.add(10);nums.add(10);nums.add(7);nums.add(8);nums.add(8);nums.add(3);nums.add(4);nums.add(8);				
			System.out.println(nums);
///////////////////////////////////////////////////////////////////////////////////////////////			
//1) FIND NON DUPLICATE uniq values. if 2 A A. => A
//[10, 10, 7, 8, 8, 3, 4, 8] ==> [10, 7, 8, 3, 4]
		List<Integer> uniq1 = new ArrayList<>();	
		for(Integer q : nums) {	
//assign num to uniq1 if nums is not already there
			if(!uniq1.contains(q)) {
				uniq1.add(q);
			}
		}
			System.out.println(uniq1.toString()); //[10, 7, 8, 3, 4]
////////////////////////////////////////////////////////////////////////////////////////////////			
//2) FIND UNIQ(appearing once) value
//[10, 10, 7, 8, 8, 3, 4, 8] ==> [7, 3, 4]
		List<Integer> uniq2 = new ArrayList<>();
		for(int q = 0; q < nums.size(); q++) {
			int count = 0;
			Integer value = nums.get(q);
			
			for(int q2 = 0; q2 < nums.size(); q2++) {
				if(nums.get(q2) == value && q != q2) {
					count++;
					break;
				}
			}
			if(count == 0) {
				uniq2.add(value);
			}
		}	
		System.out.println(uniq2); //[7, 3, 4]					
}}