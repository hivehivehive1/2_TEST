package Assignments_REPLIT;
import java.util.Scanner;
public class a127_2D_Array_LARGest_NUMBER {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		int rows = inp.nextInt(), cols = inp.nextInt();
		int[][] arr = new int[rows][cols];
		for (int i = 0; i <= rows - 1; i++) {
			for (int j = 0; j <= cols - 1; j++) {
				arr[i][j] = inp.nextInt();
			}
		}
		int biggest = arr[0][0];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] > biggest) {
					biggest = arr[i][j];
				}
			}
		}
		System.out.println(biggest);
	}
}