package day15_Strings_manipulatuion;

public class StartsWITH_endsWITH {

	public static void main(String[] args) {
		String word1 = "eclipse";
		//startsWITH => test if String starts with another
//		System.out.println(word1.startsWith("e"));   //true
//		System.out.println(word1.startsWith("ecl")); //true
//		System.out.println(word1.startsWith("lip")); //false
//		System.out.println(word1.startsWith("Ec"));  //false
		
		System.out.println(word1.endsWith("e"));    //true
		System.out.println(word1.endsWith("ipse")); //true
		System.out.println(word1.endsWith("java")); //false
								 //ECLIPSE       PSE		
		System.out.println(word1.toUpperCase().endsWith("PSE")); //true
		
		//Mr. ==> male
		//Mrs.==> married woman
		//Ms. ==> girl
		//Dr. ==> Doctor man
		// ==> illigal
		String name = "Mr. Jackson";
		if(name.startsWith("Mr.")) {
			System.out.println("man");
		}else if(name.startsWith("Mrs.")) {
			System.out.println("married woman");
		}else if(name.startsWith("Ms.")) {
			System.out.println("girl");
		}else if(name.startsWith("Dr.")) {
			System.out.println("Doctor");
		}else {
			System.out.println("ILIGAL MEXICON GUY");
		}
			
			
			
		
		
}}
