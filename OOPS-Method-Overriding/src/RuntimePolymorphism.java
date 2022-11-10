import printer.Printer;

public class RuntimePolymorphism {

	public static void main(String[] args) {
		
		//
//		Class<?> cls = 
//		Class.forName("Printer");
//		Object obj = cls.newInstance();
		
		
		Printer printer = new Printer();
//		printer.print();
		
		ColorPrinter colorPrinter = new ColorPrinter();
//		colorPrinter.print();

		printer = colorPrinter;
		printer.print();
	}
}
