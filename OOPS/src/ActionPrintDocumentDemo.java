
public class ActionPrintDocumentDemo {

	class Printer {
		
		void printDocument(File fileObject){
			
		}
	}
	
	class File {
		
	}
	
	public static void main(String[] args) {
	
		// Action - 1
		// Printer-01 printing the document java-pdf
		
		
		//Objects
			/*
			 * printer-01
			 * java-pdf
			 */
		
		//
			/*Classes / Category 
			 * Printer (printer-01, printer-03)
			 * File (java.pdf, harry-potter.pdf)
			 */
		
		//Action name
//			printDocument
		
		// Primary Object
			//printer-01
		
		// Dependent Elements
		// What all elements have to be present for the action to be performed
		// java-pdf
		
		Printer printer_01 = null;		
		File java_pdf = null;
		
		printer_01.printDocument(java_pdf);
		// java_pdf
			// location (C:\files\java.pdf)
			// type  (PDF) [DOC, TXT, JPG)
			// noOfPages - 10
		
		Printer printer_03 = null;
		File harry_potter_book_pdf = null;
		printer_03.printDocument(harry_potter_book_pdf);
		
	}
	
	
	void test() {
		
		int maryAge = 25;
		
		int rahulAge = 35;
	}
	
}
