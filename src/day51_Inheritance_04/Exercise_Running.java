package day51_Inheritance_04;

public class Exercise_Running extends Exercise{
	int calories;
	@Override
	public int perform(int minutes) {
		System.out.println("Running");
		this.calories = minutes * 10;
		return minutes * 10;
	}
}