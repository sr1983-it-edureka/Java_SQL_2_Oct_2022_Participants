
public class FunctionDemoV3 {

	public static void main(String[] args) {
		
		launchWebsiteFacebook();
		launchWebsiteInstagram();
		launchWebsiteTwitter();
		
		printDocument();
		
		downloadSoftware();
	}
	
	static void launchWebsiteFacebook(){
		
		// Open Browser - Navigate to Facebook
		
		System.out.println("Opening Chrome Browser");
		System.out.println("Navigated to facebook.com");
		System.out.println("Navigation Done...");
		
		System.out.println();
		
	}
	
	static void launchWebsiteTwitter(){
		
		// Open Browser - Navigate to Twitter
		
		System.out.println("Opening Chrome Browser");
		System.out.println("Navigated to twitter.com");
		System.out.println("Navigation Done...");
		
		System.out.println();
		
	}	
	
	static void launchWebsiteInstagram(){
		
		// Open Browser - Navigate to Instagram
		
		System.out.println("Opening Chrome Browser");
		System.out.println("Navigated to instagram.com");
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
