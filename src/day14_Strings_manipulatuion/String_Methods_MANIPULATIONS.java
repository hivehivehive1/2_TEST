package day14_Strings_manipulatuion;
public class String_Methods_MANIPULATIONS {
	public static void main(String[] args) {
	String str = "Market report has been generated";
		
	System.out.println(str.indexOf("hello"));//-1 JUST NOT AVILABLE
	System.out.println(str.indexOf("been"));//18 position
	System.out.println(str.indexOf('r', 6));//6 mean START counting from 6 position
	System.out.println(str.indexOf('r')); //2  //1st occurrence of r
//	System.out.println('r', str.indexOf('r') +1); //2nd occurrence of s
	System.out.println(str.charAt(5)); //t => (Marke ->t)
	
	System.out.println(str.equals("hello")); //false
//	System.out.println(str.repeat(300)); //300 times repeating  if put in (" \n")
//	System.out.println(str.repeat(300)); //300 times repeating =>=>
	System.out.println(str.substring(14, 22)); //("has been")
	System.out.println(str.substring(14));   //14("has been generated")
	
//	System.out.println(str.stripTrailing()); //Del space from end
//	System.out.println(str.stripLeading()); //Del space from front
//	System.out.println(str.strip()); // Deleting SPACES front-end
	System.out.println(str.toLowerCase()); //LOW Case
	System.out.println(str.toUpperCase()); //UP Case
// \t => TAB
// \n => NEWLINE	
//-----------------String comparison---------------------------
	String str2 = "Market report has been generated";
	System.out.println(str2.equals(str));//true
	System.out.println(str2.equalsIgnoreCase(str));//Ignore camel case
//------------------SubString-----------------------------------
	System.out.println(str2.substring(14, 22));//("has been")
//------------------Trim----------------------------------------	
	String s = "    Hello Word    ";
	System.out.println(s.trim()); //DEL space Before-After
	System.out.println(s.replace(" ", "")); //DEL space between ("HelloWord")
	
	String data = "03-03-2019"; //=> 03/03/2019
	System.out.println(data.replace("-", "/"));
//--------------------Split-------------------------------------
	String test = "Hello_World_Test_Selenium"; //Hello
	String testval [] = test.split("_");       //World
	for(int i=0; i< testval.length; i++) {     //Test
	System.out.println(testval[i]);  }         //Selenium
//---------------------------------------------------------------
	String s2 = "Car";
	System.out.println(s2.concat("s")); //Car + s
	String x = "Hello";
	String z = "World";
	 int a = 100;
	 int b = 200;
	System.out.println(x+z+a+b); //HelloWorld100200
	System.out.println(a+b+x+z); //300HelloWorld
	System.out.println(x+z+(a+b));//HelloWorld300
}}