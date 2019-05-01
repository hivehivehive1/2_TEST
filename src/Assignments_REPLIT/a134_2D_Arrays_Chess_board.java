package Assignments_REPLIT;
import java.util.Arrays;
public class a134_2D_Arrays_Chess_board {
	public static void main(String[] args) {
		
		String [][] chessBoard = new String [8][8];
		String [] count = {"1","2","3","4","5","6","7","8"};
		String [] countChar = {"a","b","c","d","e","f","g","h"};
		
		for(int i = 0; i < chessBoard.length; i++) {
			for(int j = 0; j < chessBoard[i].length; j++) {
				chessBoard[j][i] = count[j] + countChar[i];
			}
		}
		System.out.println(Arrays.deepToString(chessBoard));
}}