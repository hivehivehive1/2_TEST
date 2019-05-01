package day13_ternary_STRINGS_intro;
public class More_TERNARY {
	public static void main(String[] args) {
		String quality = "good";
		int rating = (quality.equals("good")) ? 100 : 0;
		System.out.println("Rating: " + rating);
		
		int PHhour = 6; //Rush hour during evening: 4 - 7
		boolean rushHour = (PHhour >= 4 && PHhour <= 7) ? true : false;
		System.out.println(PHhour + " is rush hour? " + rushHour);
		
//		rushHour ==> true - yes
//		rushHour ==> false - no
		
		String result = rushHour == true ? "yes" : "no";
		int PHhour2 = 6; //Rush hour during evening: 4 - 7
		boolean rushHour2 = (PHhour2 >= 4 && PHhour <= 7) ? true : false;
		System.out.println(PHhour2 + " is rush hour? " + rushHour2);
		
		int AMHour = 8;  //6 - 9 amRushHour - yes - no?
		String amRushHour = AMHour >= 6 && AMHour <= 9 ? "YES" : "NO";
		System.out.println(AMHour + " is rush hour? - " + amRushHour);
}}