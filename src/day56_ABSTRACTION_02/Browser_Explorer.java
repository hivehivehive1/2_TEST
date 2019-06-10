package day56_ABSTRACTION_02;
public class Browser_Explorer extends Browser {
	@Override
  //public abstract void navigator(String url);
	public void navigator(String url) {
		System.out.println("Explorer - navigating to " + url);
	}
	@Override
  //public abstract void displayWebpage();	
	public void displayWebpage() {
		System.out.println("Explorer - displaing webpage");
	}
	@Override
  //public abstract boolean launch();
	public boolean launch() {
		System.out.println("Explorer is launching");
		System.out.println("1 2 3");
		return true;
	}
	public void close() {
		System.out.println("Exitting EXPLORER!");
	}
}