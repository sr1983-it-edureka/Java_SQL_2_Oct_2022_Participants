
public class PrinterPropertiesDemo {

	public static void main(String[] args) {
				
		File harryPotterPDFFile = new File();
		harryPotterPDFFile.name = "Harry Potter - Part 5";
		harryPotterPDFFile.noOfPages = 751;

		Printer printer01 = new Printer();
		printer01.model = "HP Deskjet 1234";
		printer01.color = "White";
		printer01.price = 9000.00F;
		
		printer01.display();
		printer01.printDocument(harryPotterPDFFile);
		
		/*
		Printer printer03 = new Printer();
		
		printer03.model = "HP deskjet Advanced";
		printer03.color = "Black";
		printer03.price = 12500.00F;
		
		printer03.display()
		*/
	}
}
