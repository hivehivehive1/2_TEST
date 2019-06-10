package day57_INTERFACES;
public interface Electric {
	
	public static final boolean HAS_BATTERIES = true;
	int MAX_BATTERIES = 1_000_000; //public static final 
	
	
	public abstract void charge();
	
}