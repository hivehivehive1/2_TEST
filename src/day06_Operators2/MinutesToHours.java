package day06_Operators2;

public class MinutesToHours {

	public static void main(String[] args) {
		int minutes = 125;
		int hours = minutes / 60;
		int remainingMinutes = minutes % 60;
		
		
//	System.out.println(hours);
//	System.out.println(remainingMinutes);
	System.out.println(minutes+" minutes is... ");
	System.out.println(hours+" hours and "+remainingMinutes+" minutes");

	}

}
