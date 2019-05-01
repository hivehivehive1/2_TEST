package day25_ARRAYS_ArrayList_Set_MAP;
public class PopulationArray {
	public static void main(String[] args) {
		int[] population = new int[5];
		population[0] = 5000;
		population[1] = 10000;
		population[2] = 7000;
		population[4] = 8907;
		population[3] = 4455;

		//int[] population = {5000, 10000, 7000, 4455, 8907};
		int[] population2 = {5000, 5000*2, 7000, 4455, 8907};
		System.out.println( "City 0 population :" + population[0] );
		System.out.println( "City 1 population :" + population[1] );
		System.out.println( "City 2 population :" + population[2] );
		System.out.println( "City 3 population :" + population[3] );
		System.out.println( "City 4 population :" + population[4] );
		//System.out.println( "City 5 population :" + population[5] );

		int idx = 0;
		System.out.println( "City 0 population :" + population[idx] );

		idx++;
		System.out.println( "City 1 population :" + population[idx] );

		String str = "abc";													//3
		System.out.println( "City STR.LENGTH() population :" + population[str.length()] );

		//String array called cities = "Miami" , "London", "Tokyo", "Rome", "New York"

		String[] cities = {"Miami" , "London", "Tokyo", "Rome", "New York"};


		//Population of Miami is 5000
		//Population of London is 10000
		//Population of Tokyo is 7000
		//Population of Rome is 4455
		//Population of New York is 8907

		System.out.println("Population of " + cities[0] + " is " + population[0] );
		System.out.println("Population of " + cities[1] + " is " + population[1] );
		System.out.println("Population of " + cities[2] + " is " + population[2] );
		System.out.println("Population of " + cities[3] + " is " + population[3] );
		System.out.println("Population of " + cities[4] + " is " + population[4] );
}}