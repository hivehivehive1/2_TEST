package day57_INTERFACES;
public class Dog implements Pet {
	public void responde() {
		System.out.println("Dog is responding wfwfwfwf");
	}
	
	@Override
	public void keepAsPet() {
		System.out.println("Dog i kepping in the house");
		
	}
}