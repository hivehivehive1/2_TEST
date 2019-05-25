package day50_Inheritance_03;
public class App_AndroidApp extends App{
	private String developer;
	//subCLASS
	//1. add a constractor
	//2. call a super constractor
	public App_AndroidApp(String name) {
		super(name);
	}
	public App_AndroidApp() {
		super("IPhone App - unknow");
	}
}