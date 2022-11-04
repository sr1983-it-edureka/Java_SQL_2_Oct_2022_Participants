
// Child
public class SmartTelevision extends BaseDevice {

	byte noOfRemotes;
	
	SmartTelevision(String lManufacturer, String lModel, 
		String lColor, byte lNoOfRemotes ) {

		super(lManufacturer, lModel, lColor);
		
		noOfRemotes = lNoOfRemotes;
	}	
	
	void display() {
		
		super.display();
		
		System.out.println("No. Of Remotes " + noOfRemotes);
	}	
}
