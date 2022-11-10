package interfaces;

public interface Printer {

	// Property
	boolean switchedOn = false;
	
	// Property
	boolean switchedOff = true;
	
	// Action / Behaviours
	void switchOn();
	
	void switchOff();
	
	void printDocument();
}
