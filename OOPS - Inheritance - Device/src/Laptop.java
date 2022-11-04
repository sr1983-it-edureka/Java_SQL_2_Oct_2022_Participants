
// Child / Derived / Sub Class

public class Laptop extends BaseDevice {
	
	boolean backlightSupportForKeypad;
	
	Laptop(String lManufacturer, String lModel, 
			String lColor, boolean lBacklightSupportForKeypad) {
		
		super(lManufacturer, lModel, lColor);
		
		backlightSupportForKeypad = lBacklightSupportForKeypad;
	}
	
	void display() {
		
		super.display();
		
		System.out.println("Backlight Support " + backlightSupportForKeypad);
	}

}
