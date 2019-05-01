package Assignments_REPLIT;
import java.util.Scanner;
public class a129_2D_Arrays_MATCH_TWO {
	public static void main(String[] args) {
		
//		Scanner inp = new Scanner(System.in);
//		int rows = inp.nextInt(), cols = inp.nextInt();
//		int[][] arr = new int[rows][cols];
//		for (int i = 0; i <= rows - 1; i++) {
//			for (int j = 0; j <= cols - 1; j++) {
//				arr[i][j] = inp.nextInt();
//			}
//		}
		int[][] arr = {{1,1,8,7,1,1},{1,2,3,4,5,6}};
		int matches = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length - 1; j++) {
				if (arr[i][j] == arr[i][j + 1]) {
					matches++;
				}
			}
		}
		System.out.print("matches: " + matches);
	}
}