package day56_ABSTRACTION_02;
public class Browser_CHROME extends Browser {
	public Browser_CHROME(String name, int id) {
		super(name, id);
	}
	
	
	@Override
	  //public abstract void navigator(String url);
		public void navigator(String url) {
			System.out.println("Chrome - navigating to " + url);
		}
		@Override
	  //public abstract void displayWebpage();	
		public void displayWebpage() {
			System.out.println("Chrome - displaing webpage");
		}
		@Override
	  //public abstract boolean launch();
		public boolean launch() {
			System.out.println("Chrome is launching");
			System.out.println("1 2 3");
			return true;
		}
		public void close() {
			System.out.println("Exitting Chrome!");
		}

}