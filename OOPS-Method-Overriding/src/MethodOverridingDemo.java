
public class MethodOverridingDemo {

	public static void main(String[] args) {
		
		
	}
	
	static void methodOverridingDemo() {
		
		Printer printer02 = new Printer();
		printer02.print();
		
		ColorPrinter printer04 = new ColorPrinter();
		printer04.print();
	}
}
