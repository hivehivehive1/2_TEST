package Vasia_jun_06;
public class Redbox_Fantasy extends Redbox_Movie {

	public Redbox_Fantasy(String rating, int idNumber, String title, Redbox_Director director) {
		super(rating, idNumber, title, director);
	}
	@Override
	public double calcLateFees(int numberDays) {
		return numberDays * 3.5;
	}
}