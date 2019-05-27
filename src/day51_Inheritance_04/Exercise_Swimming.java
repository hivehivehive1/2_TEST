package day51_Inheritance_04;

public class Exercise_Swimming extends Exercise{
	@Override
	public int perform(int minutes) {
		System.out.println("Swimming");
		return minutes * 11;
	}
}