package day08_ENDchap2;

public class IF_ELSE_Variables {

	public static void main(String[] args) {
		int temp = 45;
		if(temp >= 65) {
			System.out.println("It is a nice day!");
		}else {
			System.out.println("Stay home and code java");
		}
		
		//2 int variables, teamAScore, teamBScore
		//put a condition. check if team A won 
		//"Team A won"
		// Go to Team A!
		//else "team b won or it was a draw
		int teamAScore = 5;
		int teamBScore = 45;
		       //5          9
		if (teamAScore > teamBScore) {
			System.out.println("Team A Won!");
			System.out.println("Go Team A!");
		}else {
			System.out.println("Team B won it was a draw");
			System.out.println("Go Team!");
		}
	}

}
