package day50_Inheritance_03;
public class App_IPhoneApp extends App{
	private String developer;
	//subCLASS
	//1 add a constructor (becaous super class does not have empty one
	//2call super constructor
	public App_IPhoneApp() {
		super("IPhoneALL - unknow"); //super - to call constractor from pasrent class
	}
	public App_IPhoneApp(String name) {
		super(name);
	}
}