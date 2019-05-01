package day26_Array_in_Java;
import java.util.Arrays;
import java.util.Random;
public class Names {
	public static void main(String[] args) {
		String[] names = { "Urma", "Mary", "Adik", "Patricia", "Robert", "Jennifer"};
//Print number of names in the array
		System.out.println("Total Names: " + names.length);

System.out.println("*********************************************ALL NAMES IN SINGLE LINE*");

//Print all names in single line
		System.out.println(Arrays.toString(names));

System.out.println("**************************************************************2 Names*");

//Print in column format. 2 names in each lines //"Urma", "Mary",
		for(int i = 0; i < names.length; i += 2) { //"Adik", "Patricia",
			System.out.println(names[i] + ", " + names[i + 1]);  }

System.out.println("***********************************************************MALE NAMES*");

//print MALENAMES in single lines separated by comma
		for(int m = 0; m < names.length; m += 2) {
			System.out.print(names[m] + ", ");
		}
System.out.println();
System.out.println("*********************************************************FEMALE NAMES*");

//Print FEMALE NAMES
		for(int f = 0; f < names.length; f++) {
			if(f % 2 != 0) {
				if(f == names.length -1) {
					System.out.print(names[f]);
				}else {
					System.out.print(names[f] + ", ");   }}}
System.out.println();
System.out.println("**********************************************************RANDOM NAME*");

//Print ONE RANDOM name
		Random random = new Random();
		int r = random.nextInt(names.length);
		System.out.println("Random name: " + names[r]);

System.out.println("***********************************************4 Char in NAMES and UP*");

//Print up to 4 characters, in UPPERCASE in same line
		for(String name: names) {
			if(name.length() <= 4)
			System.out.print(name.toUpperCase() + ", ");   }

System.out.println();
System.out.println("*******************************************************> 4, 5 > 6, 7>*");
		String namesUPto4 = "";
		String names5to6 = "";
		String names7orMore = "";

		for(String name : names) {
		if(name.length() <= 4) {
			namesUPto4 += name + ", ";
		}else if(name.length() == 5 || name.length() == 6) {
			names5to6 += name + ", ";
		}else {
			names7orMore += name + ", ";     }}
		System.out.println("namesUPto4: " + namesUPto4);
		System.out.println("names5to6: " + names5to6);
		System.out.println("names7orMore: " + names7orMore);

System.out.println("*****************************************************************SWAP*");
//SWAP names  1 to 2 to 1
		System.out.println(Arrays.toString(names));
		for(int i = 0; i < names.length; i += 2) {
			String temp = names[i];
			names[i] = names[i + 1];
			names[i + 1] = temp;
		}
		System.out.println(Arrays.toString(names));
}}