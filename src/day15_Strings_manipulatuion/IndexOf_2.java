package day15_Strings_manipulatuion;
public class IndexOf_2 {
	public static void main(String[] args) {
		//indexOf with 2 inputs
		String list = "html-selenium-grid-JAVA-ABC";
		int firstDash = list.indexOf("-");
		System.out.println("first dash: " + firstDash);   //4
		
		int secondDash = list.indexOf("-", 5); 
		System.out.println("second dash: " + secondDash); //13
		
		int thirdDash = list.indexOf("-", secondDash + 1);
		System.out.println("third dash: " + thirdDash);   //18
		
		//LastIndexOf => can be used when we search for last position of the char/String
		int lastDash = list.lastIndexOf("-");
		System.out.println("last dash: " + lastDash);     //23
		
		//int firstDash = list.indexOf("-");
		//int secondDash = list.indexOf("-", 5); 
		//int thirdDash = list.indexOf("-", secondDash + 1);
		//int lastDash = list.lastIndexOf("-");
		
}}
