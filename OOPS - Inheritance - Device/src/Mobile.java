
// Child
public class Mobile extends BaseDevice {

	byte simSlots;	

	Mobile(String lManufacturer, String lModel, 
		String lColor, byte lSimSlots) {
		
		super(lManufacturer, lModel, lColor);
		
		simSlots = lSimSlots;
	}	
	
	void display() {
		
		super.display();
		
		System.out.println("No. Of Sim Slots " + simSlots);
	}
	
}
