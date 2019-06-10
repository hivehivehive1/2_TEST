package Vasia_jun_06;
public class Redbox {
	public static void main(String[] args) {
		Redbox_Director director1 = new Redbox_Director("Anthony Russo");
		Redbox_Director director2 = new Redbox_Director("Bradley Cooper");

		Redbox_Fantasy avangers = new Redbox_Fantasy("PG-13", 1, "Avengers: Endgame", director1);

		Redbox_Drama astarisborn = new Redbox_Drama("R", 2, "A Star Is Born", director2);
		System.out.println(avangers.calcLateFees(5));
		System.out.println(astarisborn.calcLateFees(5));

		Redbox_Fantasy avangers2 = new Redbox_Fantasy("PG-3", 1, "Avengers", director1);
		System.out.println(avangers.equals(avangers2));
	}
}