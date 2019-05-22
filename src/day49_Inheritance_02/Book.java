package day49_Inheritance_02;
public class Book { //UML Diagram - Unified Modeling Language

	private String Title;
	private String Type;
	private String Author;
	private double Price;
	
	
	@Override
	public String toString() {
		return "Book [ Title = " + Title + ", Type = " + Type + ", Author = " + Author + ", Price = " + Price + " ]";
	}
	
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
}