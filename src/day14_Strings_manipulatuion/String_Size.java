package day14_Strings_manipulatuion;
public class String_Size {
	public static void main(String[] args) {
		String str1 = "Good Morning";
		//check if it matches "Good Morning" and print match or no match
		//Convert to ALL uppercase and print
		if(str1.equals("Good Moring")) {
			System.out.println("Match");
		}else {
			System.out.println("Not Match");
		}
		if(str1.equalsIgnoreCase("good moring")) {
			System.out.println("Match - ignor case");
		}else {
			System.out.println("Not Match - ignor case");
		}
		//Convert to ALL uppercase and print
		System.out.println(str1.toUpperCase()); //GOOD MORNING
		System.out.println(str1); //it stays as old value. not uppercase
		str1 = str1.toLowerCase(); 				//Good Morning
		System.out.println("After assignment: " + str1); //After assignment: good morning
		
		//combine the above methods together:
		//convert to all lowercase first then check if it equals("good morning")
		if(str1.toLowerCase().equals("good morning")) {
			System.out.println("Chained methods: match"); //Chained methods: match
		}else {
			System.out.println("Chained methods: do not match");
		}
			//FIND OUT HOW MANY CHARACTERS IN THE STRING
		String myName = "Adilet"; //6
		System.out.println(myName.length());
			
		int length = myName.length();
		System.out.println("My name's in length: " + length);
//--------------------------------------------------------------------------------	
		//username must be exectly 8 characters.
		//set some value and using a IF statment check it is 8 char: 
		//if true => valid username. false => invalid username! MUST BE 8 CHARS
		String userName = "QWERTY12";
		if(userName.length() == 8) {
			System.out.println("Valid username"); //Valid username
		}else {
			System.out.println("InValid username, must be 8 chars");
		}
//---------------------------------------------------------------------------------						
		//password must be at least 6 characters
		String password = "QWERTY";
		//1)
		if(password.length() >= 6) {
			System.out.println("Password is good"); //Password is good
		}else {
			System.out.println("Password is too short");
		}
//---------------------------------------------------------------------------------		
		int passwordLength = password.length();
		if(passwordLength < 6) {
			System.out.println("Invalid password. Too short");
		}else {
			System.out.println("Valid password, good job"); //Valid password, good job
        }
}}