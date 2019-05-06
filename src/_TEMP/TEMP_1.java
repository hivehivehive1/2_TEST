package _TEMP;
import java.util.*;
public class TEMP_1 {
	public static void main(String[] args) {
		int[] a = {1, 2, 3};
		int[] b = {4, 5, 6};
		
	    int i = 0;
	    int[] com = new int[a.length + b.length];
	    for(int m : a) {
	        com[i] = m;
	        i++;
	    }
	    for(int m : b) {
	        com[i] = m;
	        i++;
	    }
		System.out.println(Arrays.toString(com));
}}