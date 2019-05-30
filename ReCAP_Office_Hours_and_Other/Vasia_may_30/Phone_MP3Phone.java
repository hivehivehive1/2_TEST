package Vasia_may_30;
public class Phone_MP3Phone extends Phone {
	private int memorySize;
	private boolean playAAC;
	
	public Phone_MP3Phone(String phoneNumber, int memorySize, boolean playAAC) {
		super(phoneNumber, true);
		this.memorySize = memorySize;
		this.playAAC = playAAC;
	}
	
	public String toString() {
		return "MP3Phone";
	}
}