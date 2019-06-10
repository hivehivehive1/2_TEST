package Vasia_jun_06;

public abstract class Redbox_Movie {
	private String rating;
	private int idNumber;
	private String title;
	private Redbox_Director director;

	public Redbox_Movie(String rating, int idNumber, String title, Redbox_Director director) {
		this.rating = rating;
		this.idNumber = idNumber;
		this.title = title;
		this.director = director;
	}

	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public int getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Redbox_Director getDirector() {
		return director;
	}
	public void setDirector(Redbox_Director director) {
		this.director = director;
	}
	//not overriding anymore, because method signature is different
	public boolean equals(Redbox_Movie m) {
		return m.idNumber == this.idNumber;
	}
	public abstract double calcLateFees(int numberDays);
}