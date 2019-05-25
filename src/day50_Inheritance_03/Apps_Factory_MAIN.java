package day50_Inheritance_03;
public class Apps_Factory_MAIN {
	public static void main(String[] args) {
		App_IPhoneApp iApp = new App_IPhoneApp();
		App_IPhoneApp iApp2 = new App_IPhoneApp("Uber");
		System.out.println(iApp.getName());
		System.out.println(iApp2.getName());

		App_AndroidApp aApp = new App_AndroidApp();
		App_AndroidApp aApp2 = new App_AndroidApp("Lyft");
		System.out.println(aApp.getName());
		System.out.println(aApp2.getName());

		App.count = 33;
		System.out.println(App_IPhoneApp.count);
		App_AndroidApp.count = 100;
		System.out.println("App_IPhoneApp.count: " + App_IPhoneApp.count);
		System.out.println("App_AndroidApp.count: " + App_AndroidApp.count);
		
		System.out.println("App.count: " + App.count);
		
		App.build("Swift");                 //"Build an App using Swift"
		App_IPhoneApp.build("Objective C");
		App_AndroidApp.build("Java");
		aApp2.build("JavaScript");          //will also work
}}