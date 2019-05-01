package day16_Strings_manipulatuion_METHODS;
public class PuttWordInBetween {
	public static void main(String[] args) {
		String chars = "<<>>";
		String word = "Java";
		String result = chars.substring(0, 2) + word + chars.substring(2);
		System.out.println(result); //<<Java>>
				
				

	}

}
