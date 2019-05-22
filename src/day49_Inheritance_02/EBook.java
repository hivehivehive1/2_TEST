package day49_Inheritance_02;
				//  IS-A
public class EBook extends Book {
	
	private double size;
	private int pages;
	
	public void readEBook(int pageNum) {
//Reading java book by "Savich" at page 10
		System.out.println("Reading " + getTitle() + " by " + getAuthor() + " at page " + pageNum);
	}

	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
}