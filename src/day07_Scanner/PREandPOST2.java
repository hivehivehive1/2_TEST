package day07_Scanner;

public class PREandPOST2 {

	public static void main(String[] args) {
		int messages = 10;
		messages++; //11
		++messages; //12
		System.out.println("Messages: " + messages); //12
		
		int readMessages = --messages;
		System.out.println("ReadMessages: " + messages); //11
		System.out.println("Messages: " + messages);     //11
				//11			//11		
		int unreadMessages = readMessages--;
		System.out.println("unreadMessages: " + unreadMessages); //11
		System.out.println("readMessages: " + readMessages);  //10
						//11				/10
		int total = unreadMessages++ - readMessages--;
		System.out.println("unreadMessages: " + unreadMessages); //12
		System.out.println("readMessages: " + readMessages);  //9
		System.out.println("total: " + total); //1
		
		int count = 20;
		int count2 = 10;
						  //21   +     9
		int totalcount = ++count + --count2;
		System.out.println("count: " + count); //21
		System.out.println("count2: " + count2); //9
		System.out.println("totalCount: "+ totalcount); //30
					  //21    +    23
		int MyCount = count++ + ++count;
		System.out.println("count: " + count);     //23
		System.out.println("myCount: " + MyCount); //44
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
