
public class FunctionDemoV4 {

	public static void main(String[] args) {
		
		launchWebsite("facebook.com");
		launchWebsite("instagram.com");
		launchWebsite("twitter.com");
		launchWebsite("edureka.com");
		launchWebsite("tcs.com");
		
		printDocument();
		
		downloadSoftware();
	}
		
	
	static void launchWebsite(String websiteName){
				
		System.out.println("Opening Chrome Browser");
		System.out.println("Navigated to " + websiteName);
		System.out.println("Navigation Done...");
		
		System.out.println();
		
	}		
	static void printDocument(){
		
		// Print a document
		System.out.println("Sending a document to the printer...");
		System.out.println("Printer printing the first 10 pages..");
		System.out.println("Printer done its job");
		
		System.out.println();
		
	}
	
	
	static void downloadSoftware(){
		
		// Download a software
		System.out.println("Attempting to download the latest version "
				+ "of Google Chrome - 52.0");
		System.out.println("Software downloading is done...");
		
	}
}
