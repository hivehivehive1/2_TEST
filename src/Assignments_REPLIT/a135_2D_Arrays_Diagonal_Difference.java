package Assignments_REPLIT;
import java.util.Scanner;
public class a135_2D_Arrays_Diagonal_Difference {

	public static void main(String[] args) {	//input 6, 2, 5, 3
		Scanner scan = new Scanner(System.in);	//output2, 5, 3, 6
		int[][] matrix = new int[][] { { scan.nextInt(), scan.nextInt(), scan.nextInt() },
				{ scan.nextInt(), scan.nextInt(), scan.nextInt() },
				{ scan.nextInt(), scan.nextInt(), scan.nextInt() } };

		int result = 0;
		result = ((matrix[0][0] + matrix[1][1] + matrix[2][2]) - (matrix[0][2] + matrix[1][1] + matrix[2][0]));
		System.out.println(Math.abs(result));
	}
}