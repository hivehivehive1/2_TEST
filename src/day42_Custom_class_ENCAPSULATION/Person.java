package day42_Custom_class_ENCAPSULATION;
public class Person {
	//declare name and age encapsulated data
	private String name;
	private int age;
	//public getter and setter method for name
	//read only
	public String getName() {
		return name;
	}
	//write only - void
	public void setName(String name) {
		this.name = name;		
}}