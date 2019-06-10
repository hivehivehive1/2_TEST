package day56_ABSTRACTION_02;
public class Phone_IPhone extends Phone_MOBILE {

	@Override
	public void text(String message) {
		System.out.println("IPhone sending msg: " + message);
		
	}
	@Override
	public void call() {
		System.out.println("IPhone is calling");
		
	}
}