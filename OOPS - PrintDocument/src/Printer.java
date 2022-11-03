
public class Printer {

	String model;
	String color;
	float price;

	void printDocument(File fileObject){
		
		System.out.println("Started to print the document...");
		
		String documentName = fileObject.name;
		
		System.out.println("The document " + documentName + " is now being printed");
		System.out.println("Number of pages printed ->" + fileObject.noOfPages);
	}
	
	void display() {
		
		System.out.println("Model is " + model);
		System.out.println("Color is " + color);
		System.out.println("Price is " + price);
		
		System.out.println();
	}

}
