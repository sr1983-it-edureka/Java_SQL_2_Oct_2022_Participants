
public class FunctionDemoV7 {

	public static void main(String[] args) {
		
		launchWebsite("facebook.com");
		launchWebsite("instagram.com");
		launchWebsite("twitter.com");
		launchWebsite("edureka.com");
		launchWebsite("tcs.com");
		
		printDocument("FunctionDemo.java", "PRINTER-7", 3);
		printDocument("SQL Crash Course.pdf", "PRINTER-4", 20);
		
		downloadSoftware("Google Chrome", 52.1F);
		downloadSoftware("Zoom", 11.1F);
		downloadSoftware("Eclipse", 2022.0F);
	}
		
	
	static void launchWebsite(String websiteName){
				
		System.out.println("Opening Chrome Browser");
		System.out.println("Navigated to " + websiteName);
		System.out.println("Navigation Done...");
		
		System.out.println();
		
	}		
	static void printDocument(
		String documentName, String printerID, int noOfPages ){
		
		// Print a document
		System.out.println("Sending the document " + documentName 
				+ " to the printer ..." + printerID );
		System.out.println("Printer printing the first " + noOfPages + " pages..");
		System.out.println("Printer done its job");
		
		System.out.println();
		
	}
	
	static void downloadSoftware(
		String softwareName, float softwareVersion){
		
		// Download a software
		System.out.println("Attempting to download the latest version "
				+ "of " + softwareName + " - " + softwareName );
		System.out.println("Software downloading is done...");
		
	}	
	
}
