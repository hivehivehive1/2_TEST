package day57_INTERFACES;
public class Cat implements Pet, Callable {
	public void respond() {
		System.out.println("Cat is responding");
	}

	@Override
	public void keepAsPet() {
		System.out.println("Cat is kept inside home");
		
	}
}