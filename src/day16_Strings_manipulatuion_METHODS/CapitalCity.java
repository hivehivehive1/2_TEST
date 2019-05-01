package day16_Strings_manipulatuion_METHODS;

public class CapitalCity {

	public static void main(String[] args) {
		String str = "Moscow is a capital of Russia";
		//Bishkek, Kyrgyzstan
		str = str.replace("Moscow", "Bishkek").replace("Russia", "Kyrgyzstan");
		System.out.println(str);
		
		String email = "hive@usa.com";
		String comp = "Gooooooogle";
		
		String nMail = email.replace("usa", comp);
		System.out.println(nMail);

	}

}
