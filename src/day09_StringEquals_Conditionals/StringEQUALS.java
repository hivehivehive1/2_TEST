package day09_StringEquals_Conditionals;
public class StringEQUALS {
	public static void main(String[] args) {
		String str1 = "java";
		String str2 = "java";
		//using ==
		System.out.println(str1 == str2); //true
		System.out.println(str1 == "java"); //true
		System.out.println(str1 == "JAVA"); //false
		//equals method. PREFFERRED WAY <======
		System.out.println(str1.equals(str2)); //true
		System.out.println(str1.equals("java")); //true
		System.out.println(str2.equals("JAVA")); //false
		//String month = "March";
		String month = new String("March");
		String month2 = new String("March");
		//using ==
		System.out.println(month == month2); //false. In the above line, Java is not doing values comparison.
		//It is just checking if month and month2 are pointing to same location in memory.
		System.out.println(month.equals(month2)); //true
		System.out.println(month.equals("March")); //true
		//In this exem, by using equal method, java is checking if values are same.
		//witch is proper way of comparing strings.
//==		
}}
