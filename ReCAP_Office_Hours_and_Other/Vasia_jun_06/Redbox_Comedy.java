package Vasia_jun_06;
public class Redbox_Comedy extends  Redbox_Movie {

	public Redbox_Comedy(String rating, int idNumber, String title, Redbox_Director director) {
		super(rating, idNumber, title, director);
	}
	@Override
	public double calcLateFees(int numberDays) {
		return numberDays * 2.5;
	}
}