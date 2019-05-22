package Assignments_REPLIT;
import java.util.*;
public class a204_Arrays_Populate_ARRAY {
	public static void main(String[] args) {
		
		int[] r = new int[5];
		int[] arr = new int[r.length];
		for (int i = 1, j = 0; i <= arr.length; i++, j++) {
			arr[j] = i;
		}
		System.out.println(Arrays.toString(arr));
		
System.out.println("===============================");

		int[] i2 = new int[10];
		int idx = 0;
		for (int i = 0; i < i2.length; i++) {
			for (int ii = idx + 1; ii <= i2.length;) {
				i2[i] = ii;
				idx = ii;
				break;
			}
		}
		System.out.println(Arrays.toString(i2));
}}