package day42_Custom_class_ENCAPSULATION;
public class Shoes {
	String brand;
	double size;

	public void setShoesData(String newBrand, double nSize) {
		brand = newBrand;
		size = nSize;
	}
	//rean only
	public String getShoesData() {
		return brand + " | " + size;
}}