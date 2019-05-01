package day27_Arrays;
import java.util.Arrays;
public class CopyOF {
	public static void main(String[] args) {
		double[] d1 = {2.3, 4.5, 12.4};
		double[] d2 = d1;
		
		System.out.println(Arrays.toString(d1));
		System.out.println(Arrays.toString(d2));	
		
		d1[0] = 1000.3;
		System.out.println(Arrays.toString(d1));
		System.out.println(Arrays.toString(d2));
		
		d1[1] = 666.6;
		System.out.println(Arrays.toString(d1));
		System.out.println(Arrays.toString(d2));
		
		double[] d3 = Arrays.copyOf(d2, d2.length);
		System.out.println("D3: " + Arrays.toString(d3));
}}