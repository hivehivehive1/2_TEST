package Assignments_REPLIT;
import java.util.*;
public class a121_Arrays_Print_SHORTest_Word_2 {
	public static void main(String[] args) {		//output = [cat, old, ray];
		String str = "olive, fish, hot pursuit, old, warning, python, java, coffee, cat, ray";
					
		String[] arr = str.split(",");
		String min = arr[0];
		String temp = "";
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].length() < min.length()) {
				min = arr[i];
			}
		}
		for(int j = 0; j < arr.length; j++) {
			if(min.length() == arr[j].length()) {
				temp += arr[j] + ",";
			}
		}
		String[] arr1 = temp.split(",");
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
}}