package day51_Inheritance_04;

public class Exercise_Yoga extends Exercise{
	public int perform(int minutes) {
		System.out.println("Yoga");
		return minutes * 5;
	}
}