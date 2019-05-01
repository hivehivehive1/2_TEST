package day27_Arrays;
public class times {
	public static void main(String[] args) {
		//declare 2 int arrays that can hold hour and minute
		int[] time1 = new int[2];//0,0 by default
		int[] time2 = new int[2];//0,0 by default

		time1[0] = 23;
		time1[1] = 15;
		
		time2[0] = 16;
		time2[1] = 10;
		
//Before comparing, check if both arrays have valid hour/minute
		if(time1[0] < 0 || time1[0] > 23) {
			System.out.println("Time1 has invalid hour");
			return;
		}
		
		if(time1[1] < 0 || time1[1] > 59) {
			System.out.println("Time1 has invalid minute");
			return;
		}
		
		if(time2[0] < 0 || time2[0] > 23) {
			System.out.println("Time2 has invalid hour");
			return;
		}
		
		if(time2[1] < 0 || time2[1] > 59) {
			System.out.println("Time2 has invalid minute");
			return;
		}
		//COMPARE ARRAYS and tell which one is earlier
		//compare hours
		if(time1[0] < time2[0]) {
			System.out.println("Time1 is earlier");
		}else if(time2[0] < time1[0]) {
			System.out.println("Time2 is earlier");
		}else { // hours are equal, check minutes
			if(time1[1] < time2[1]) {
				System.out.println("Time1 is earlier");
			}else if(time2[1] < time1[1]) {
				System.out.println("Time2 is earlier");
			}else {
				System.out.println("Same Time!");
			}
}}}