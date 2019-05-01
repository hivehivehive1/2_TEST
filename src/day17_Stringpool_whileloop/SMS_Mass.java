package day17_Stringpool_whileloop;
import java.util.Scanner;
public class SMS_Mass {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String message = s.nextLine();
//Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programming and problem solving}
		String sender = message.substring(message.indexOf("<") + 1, message.indexOf(">"));
		System.out.println("Sender: " + sender);
		String phoneNumber = message.substring(message.indexOf("[") + 1, message.indexOf("]"));
		System.out.println("Phone Number: " + phoneNumber);
		String messageBody = message.substring(message.indexOf("{") + 1, message.indexOf("}"));
		System.out.println("Message body: " + messageBody);
}}
