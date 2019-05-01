package day28_Arrays_MULTI;
import java.io.IOException;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Paths;
public class FastFood_SHIT {
	public static void main(String[] args) throws IOException {
//		//read all data and assign to array
		String[] data = Files.readAllLines(Paths.get("FastFoodRestaurants.csv")).toArray(new String[0]);
		System.out.println("Data size: " + data.length); //Data size: 10001
////Print first ROW
		System.out.println(data[0]); //address,city,name,postalCode,province,websites
		System.out.println(data[1]); //324 Main St,Massena,McDonald's,13662,NY,http://mcdonalds.comhttp://www.mcdonalds.com/?cid=RF:YXT_FM:TP::Yext:Referral
System.out.println("============================================================================");
		//Print last restaurant
		System.out.println(data[data.length - 1]);//5701 E La Palma Ave,Anaheim,Carl's Jr.,92807,CA,http://www.carlsjr.com
	
System.out.println("============================================================================");
//print each Restaurant info in separate line 
//		int counter = 0;
//		for(String restaurant: data) {
//			System.out.println("# " + counter + " => " + restaurant); //ALL TXT
//			counter++;
//		}
System.out.println("============================================================================");
//Print all rest info in VIRGINIA and print the number
		int countVA = 0;
		for(String row : data) {
			if(row.contains(",VA,")) {
				System.out.println(row);
				countVA++;
			}
		}
		System.out.println("Total restaurants in VA: " + countVA); //327
System.out.println("============================================================================");
//Print only rest NAME and CITY
		for(String res : data) {
			if(res.contains(",VA,")) {
				String[] resArr = res.split(",");
				System.out.println(resArr[2] + " - " + resArr[1]); //McDonald's - Winchester ..ETC
			}}
}}