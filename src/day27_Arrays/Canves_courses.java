package day27_Arrays;
import java.util.Arrays;
public class Canves_courses {
	public static void main(String[] args) {
/* String url = "https://learn.cybertekschool.com/courses/149";
147 -> Java programming
204 -> Mentoring sessions
149 -> SDLC
152 -> QA Testing
144 -> Team activity
143 -> Welcome Kit
--> split by "/" and get the last value from array
--> convert it to integer. Integer.parseInt(...) -> int value
--> switch statement and find the matching */
		String url = "https://learn.cybertekschool.com/courses/149";
		//split by '/' and stroe into array
		String[] urlArr = url.split("/");
		System.out.println(Arrays.toString(urlArr)); //[https:, , learn.cybertekschool.com, courses, 149]
		System.out.println("Length: " + urlArr.length); // Length: 5
//get last number and convert to int data type
		System.out.println(urlArr[urlArr.length - 1]); //149
		int courseID = Integer.parseInt(urlArr[4]);
		System.out.println(courseID); //149
//use switch statment to find course name		
		switch(courseID) {
		case 147 :
			System.out.println("Java Programming - MURA BRATUHA");
		break;
		case 204 :
			System.out.println("Mentoring sessions VASIKI");
		break;
		case 149 :
			System.out.println("SDLC - JIMMI no acha acha");
		break;
		case 152 :
			System.out.println("QA Testing - CHURKA");
		break;
		case 144 :
			System.out.println("Team activity - JALAPKA");
		break;
		case 143 :
			System.out.println("Welcome Kit 16k$ SHIT");
		break;
		default :
			System.out.println("Unknown code");
		}
}}