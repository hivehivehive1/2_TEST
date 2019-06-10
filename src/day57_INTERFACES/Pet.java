package day57_INTERFACES;
public interface Pet {
	public static final boolean friendly = true; //
	public abstract void keepAsPet();
	
	public default void play() {
		System.out.println("Playing hide-and-seek with a pet");
	}
	public static void feed(String food) {
		System.out.println("Feeding a pet with " + food);
	}
}