import printer.Printer;

public class AdvancedPrinter extends Printer{

	public void print() {
		
		myProtectedFunction();
		System.out.println(a);
		System.out.println("I have advanced capabilities where in, "
				+ "I can multiple documents at the same time");
	}
}
