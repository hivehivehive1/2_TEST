package day29_method_01;
import java.util.Arrays;
public class Countries {
	public static void main(String[] args) {
		String[][] countriesArray = {{"Kyrgyzstan", "Bishkek"},
									 {"Russia", "Moscow"},
									 {"Kazakstan", "Nur-Sultan"},
									 {"USA", "D.C."},
									 {"Canada", "Ottawa"},
									 {"Germany", "Berlin"},
									 {"Franch", "Paris"},
									 {"Belgium", "Brusel"},
									 {"China", "Bejing"}};
		System.out.println(countriesArray[0][0] + " | " + countriesArray[0][1]); //Kyrgyzstan | Bishkek
		System.out.println(Arrays.deepToString(countriesArray));
//[[Kyrgyzstan, Bishkek], [Russia, Moscow], [Kazakstan, Nur-Sultan], [USA, D.C.], [Canada, Ottawa], [Germany, Berlin], [Franch, Paris], [Belgia, Brusel], [China, Bejing]]		
		
//Print all the countries in same line separated by "|"
	//1) FOR loop
		for(int i = 0; i < countriesArray.length; i++) { // i += 1) will be same
		System.out.print(countriesArray[i][0] + " | ");
		}
//Kyrgyzstan | Russia | Kazakstan | USA | Canada | Germany | Franch | Belgium | China | 
System.out.println();
	//2) FOR EACH loop
		for(String[] country : countriesArray) {
			System.out.print(country[0] + " | ");
		}
//Kyrgyzstan | Russia | Kazakstan | USA | Canada | Germany | Franch | Belgium | China | 		
System.out.println();

		for(int i = 0; i < countriesArray.length; i++) { // i += 1) will be same
			System.out.print(countriesArray[i][1] + " | ");
			}
//Bishkek | Moscow | Nur-Sultan | D.C. | Ottawa | Berlin | Paris | Brusel | Bejing |  		
System.out.println();		
//Get all the Cities and add to cities[] array
//declare cities array and size needs to match countries Array size
		String[] cities = new String[countriesArray.length];
		
		System.out.println(Arrays.toString(cities));
//[null, null, null, null, null, null, null, null, null]	
		for(int i = 0; i < countriesArray.length; i++) {
			cities[i] = countriesArray[i][1];
		}
		System.out.println(Arrays.toString(cities));
//[Bishkek, Moscow, Nur-Sultan, D.C., Ottawa, Berlin, Paris, Brusel, Bejing]
System.out.println();	
//Look for Kyrgyzstan in the countriesArray and test if capital city is "BISHKEK"
		for(int b = 0; b < countriesArray.length; b++) {
			if(countriesArray[b][0].equals("Kyrgyzstan")) {
			System.out.println(countriesArray[b][1]);  //Bishkek
			if(countriesArray[b][1].equals("Bishkek")) {
				System.out.println("Kyrgyzstan test passed"); //Kyrgyzstan test passed
			}else {
				System.out.println("Kyrgyzstan test faild");
			}
			break; // EXIT the loop
		}}
}}