package printer;

public class Printer {

	// Within class
	// Witin sub--classes only
	protected int a = 10;
	
	public void print() {
		System.out.println("Printing some document" + a);
		myProtectedFunction();
	}
	
	protected int myProtectedFunction() {
		
		
		return 100;
	}
	
	
}
