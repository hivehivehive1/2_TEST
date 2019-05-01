package OH_april_15;
public class String_with_LOOPS {
	public static void main(String[] args) {
		String day = "Monday";
//check number of chars
		System.out.println(day.length());
		if(day.length() >= 6) {
			System.out.println("Possibly a valid day"); //Possibly a valid day
		}else {
			System.out.println("Days are normally 6 chars or longer");
		}
//compare Strings
		String today = "Monday";
		if(day.equals(today)) {
			System.out.println("Monday is today"); //Monday is today
		}else {
			System.out.println("Wrong day");
		}
//variable day ==> "Monday", "Friday",	"Sunday"
		if(day.equals("Monday") || 
		   day.equals("Friday") || 
		   day.equals("Sunday")) {
			System.out.println("Definitely a valid day"); //Definitely a valid day
		}else {
			System.out.println("Invalid day!");
		}
//first check if it is 6 chars then compare if it is one of three		
		if(day.length() == 6) {
			if(day.equals("Monday") || 
			   day.equals("Friday") || 
			   day.equals("Sunday")) {
			System.out.println("Definitely a valid day"); //Definitely a valid day
			}else {
			System.out.println("Invalid day!");
			}
		}
//Monday ==> check if last 3 chars are "day" endsWith method		
		if(day.endsWith("day")) {
			System.out.println("It ends with 'day'"); //It ends with 'day'
		}else {
			System.out.println("Does not end with 'day'");
		}
//substring ==> creates a partial string
		if(day.substring(3).equals("day")) {
			System.out.println("last 3 are day"); //last 3 are day
		}else {
			System.out.println("last 3 are not day");
		}
//substring with length together and make it more capable
		String myDay = "Saturday";
		System.out.println(myDay.substring(3)); //urday
		System.out.println(myDay.substring(1, 5)); //atur
		System.out.println(myDay.substring(5)); //day
		System.out.println(myDay.substring(myDay.length() - 3)); //day
		
		String last3 = myDay.substring(myDay.length() - 3);
		boolean check = last3.equals("day");
		System.out.println(check); //true
//Print each char in new line
//charAt => reads a single char at an index
		System.out.println(myDay.charAt(0));//S
		System.out.println(myDay.charAt(myDay.length() - 1)); //y
		
		for(int i = 0; i < myDay.length(); i++) {
			System.out.println(myDay.charAt(i));
		}
}}