package day28_Arrays_MULTI;
import java.util.Arrays;
public class SoccerTeams {
	public static void main(String[] args) {
		String[][] teams = new String[2][6];
//declare MultiD arrays with 2 rows and 6 columns
		teams[0][0] = "Urma";
		teams[0][1] = "Adik";
		teams[0][2] = "Aika";
		teams[0][3] = "Nurik";
		teams[0][4] = "Kuba";
		teams[0][5] = "TIMCOOK";
		
		teams[1][0] = "KOTOBASH";
		teams[1][1] = "obama";
		teams[1][2] = "tramp";
		teams[1][3] = "Mercel";
		teams[1][4] = "FRANSUAOLAND";
		teams[1][5] = "KRASAVA";
		System.out.println("First player of first team: ");
		System.out.println(teams[0][0]); //Urma
		System.out.println(teams[1][5]); //KRASAVA
		
//print how many rows/teams/arrays
		System.out.println("Number of row: " + teams.length); //Number of row: 2
		System.out.println("People of in first Team: " + teams[0].length); //People of in first Team: 6
		System.out.println("People of in second Team: " + teams[1].length); //People of in second Team: 6
		
		System.out.println(Arrays.deepToString(teams)); 
//[[Urma, Adik, Aika, Nurik, Kuba, TIMCOOK], [KOTOBASH, obama, tramp, Mercel, FRANSUAOLAND, KRASAVA]]
	
		int[][] nums = new int[3][4];
		nums[0][0] = 100; nums[0][1] = 200;	nums[0][2] = 300; nums[0][3] = 400;
		nums[1][0] = 500; nums[1][1] = 600;	nums[1][2] = 700; nums[1][3] = 800;
		nums[2][0] = 900; nums[2][1] = 111; nums[2][2] = 222; nums[2][3] = 333;
		System.out.println(Arrays.deepToString(nums)); 
		//[[100, 200, 300, 400], [500, 600, 700, 800], [900, 111, 222, 333]]
		System.out.println(Arrays.toString(nums[0]));// [100, 200, 300, 400]
		
		int[][] scores = {{1, 2, 3} , {4, 5, 6, 100000000}};
		System.out.println("Days played/Number of arrays: " + scores.length); //2
		System.out.println("Number of values in 1: " + scores[0].length); //3
		System.out.println("Number of values in 2: " + scores[1].length); //4
		
		int[][] values = new int[4][];
		values[0] = new int[] {1, 2, 3};
		values[1] = new int[] {11, 22, 33, 44, 55, 66, 77, 88, 99};
		
		values[2] = new int[2]; //0.0
		values[2][0] = 55;
		values[2][1] = 87;
		
		values[3] = new int[] {5, 12, 45, 77, 34 };
		
		System.out.println(Arrays.deepToString(values));
}}//[[1, 2, 3], [11, 22, 33, 44, 55, 66, 77, 88, 99], [55, 87], [5, 12, 45, 77, 34]]