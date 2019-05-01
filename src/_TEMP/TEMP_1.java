package _TEMP;
import java.util.*;
public class TEMP_1 {
	public static void main(String[] args) {
	//Input: 07:05:45PM // Output: 19:05:45	
		    Scanner scan = new Scanner(System.in);
			    timeConversion(scan.nextLine());
	}
	public static void timeConversion(String s) {
		if (s.contains("AM")) {
			s = s.replace("AM", "");
			String[] timeArr = s.split(":");
			if (timeArr[0].equals("12")) {
				timeArr[0] = "00";
			}
			s = timeArr[0] + ":" + timeArr[1] + ":" + timeArr[2];
		} else if (s.contains("PM")) {
				s = s.replace("PM", "");
				String timeArr[] = s.split(":");
				if (!timeArr[0].equals("12")) {
			timeArr[0] = Integer.toString(Integer.parseInt(timeArr[0]) + 12);
				}
				s = timeArr[0] + ":" + timeArr[1] + ":" + timeArr[2];
		}   
		System.out.println(s);
}}