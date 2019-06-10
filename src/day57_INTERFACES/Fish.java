package day57_INTERFACES;
public class Fish implements Pet{

	@Override
	public void keepAsPet() {
		System.out.println("Fish is kept in Fish Tank with water/food");
	}
}