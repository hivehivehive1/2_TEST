package day49_Inheritance_02;
public class Book_Shop {
	public static void main(String[] args) {
System.out.println("============================ eBook ===============================");
		EBook ebook = new EBook();
		ebook.setTitle("Java");
		ebook.setAuthor("Savich");
		ebook.setSize(1050);
		ebook.setPrice(170);
		ebook.setSize(500);
		ebook.setType("Programming");
		
		System.out.println(ebook.getTitle());
		System.out.println(ebook.getAuthor());
		ebook.readEBook(10);
		ebook.readEBook(1050);

System.out.println("============================ aBook ===============================");
		AudioBook abook = new AudioBook();
		abook.setTitle("Jay-Z");
		abook.setAuthor("Ja-Rule");
		abook.setNarrator("50 Cent");
		abook.listen();

System.out.println("============================ pBook ===============================");
		PaperBack pbook = new PaperBack();
		pbook.setAuthor("Lev Tolstoy");
		pbook.setTitle("Rap");
		pbook.setType("Underground");
		pbook.setPrice(20);
		pbook.setPages(555);
		System.out.println(pbook.toString());
}}