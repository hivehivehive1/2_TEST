package day47_blocks;
import static java.lang.Math.*;
import static java.lang.Character.*;
import static java.util.Arrays.sort;
import static java.time.LocalDateTime.now;
import java.util.Arrays;
public class Static_Imports {
	public static void main(String[] args) {
		System.out.println(PI);
		System.out.println(max(10,5));
		System.out.println(max(10,100));
		System.out.println(min(10,100));
		System.out.println(floor(3.100));
		System.out.println(round(3.99));
		System.out.println(round(10.51));
		System.out.println(abs(-10));
		System.out.println(pow(1.1, 2));
		System.out.println(sqrt(2));
		System.out.println(random() * 2);
System.out.println("================================");
		System.out.println(isDigit('4'));
		System.out.println(isAlphabetic('J'));
		
		int[] nums = {99, 1, 33, 44, 5555, 6666};
		sort(nums);
		System.out.println(Arrays.toString(nums));
		
		System.out.println(now());
		
		
		
		
	
}}