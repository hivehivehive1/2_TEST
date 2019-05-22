package day49_Inheritance_02;
public class PaperBack extends Book {
	
	private int pages;
	
	public String toString() {
//titel, author, price, type, page
		return getTitle() + " | " + getAuthor() + " | " + getPrice() +"$ | " + getType() + " | " + getPages();		
	}
	
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
}