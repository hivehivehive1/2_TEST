package day57_INTERFACES;
public class Electric_InterfaceTests {
	public static void main(String[] args) {
		//Electric el = new Electric(); cant instantiate an interface
		Electirc_TESLA t = new Electirc_TESLA();
		Electric_BMWi8 b = new Electric_BMWi8();
		
		t.charge();
		b.charge();
		
		t.drive();
		t.selfDrive();
		
		Electric el2 = new Electirc_TESLA();
		
		Cat cat = new Cat();
		cat.keepAsPet();
		cat.play();
		cat.play();
		Pet.feed("SHIT");

	}

}
