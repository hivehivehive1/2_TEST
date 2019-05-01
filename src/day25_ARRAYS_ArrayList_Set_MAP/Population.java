package day25_ARRAYS_ArrayList_Set_MAP;
public class Population {
	public static void main(String[] args) {
		int[] popu = new int[5];
		popu[0] = 0000;
		popu[1] = 1111;
		popu[2] = 2222;
		popu[4] = 4444;
		popu[3] = 3333;
		System.out.println("City 1 population: " + popu[1]);
		int i = 0;
		System.out.println("City 1 population: " + popu[i]);
		i++;
		System.out.println("City 1 population: " + popu[i]);
		String str = "asd";								//3
		System.out.println("City STR.LENGTH() population: " + popu[str.length()]);
		String[] cities = {"Miami", "Moscow", "London", "Tokyo", "Rome", "New York"};
		System.out.println("Population of " + cities[1] + ": " +popu[1]);
		System.out.println("Population of " + cities[3] + ": " +popu[3]);
}}