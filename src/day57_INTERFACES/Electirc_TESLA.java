package day57_INTERFACES;
public class Electirc_TESLA extends Electric_Vehicle implements Electric, Electric_Automonous {

	@Override
	public void charge() {
		System.out.println("Tesla is charging at charging station");	
	}
	@Override
	public void selfDrive() {
		System.out.println("Tesla is in auto pilote mode. Driving by CODE");
	}
	

}
