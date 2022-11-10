package cts.advertisments;

public class Advertisement {
	
	// Within the class, Class part of the same package
	// Any class (different package) can acccess
	public String COMPANY_NAME = "Greenwich Ad Company";
	
	
	// Within the class
	private String OPERATION_OUTCOME = "FAILURE";

	// default access / package level access
	int NO_OF_FAILURE_ADS = 5;

	private String myPrivateMethod() {
		return "My Private Stuff";
	}
	
	String myDefaultAccessMethod() {
		return "abc";	
	}
	
	public void runOnTV(String product, int duration) {
		
		System.out.println("Running advertisement for product " + product 
				+  " on TV for " + duration + " seconds");
		
		myPrivateMethod();
		myDefaultAccessMethod();
	}
	
	public void displayProducts(String[] products) {
		
		System.out.println(COMPANY_NAME);
		System.out.println(OPERATION_OUTCOME);
		
		System.out.println(NO_OF_FAILURE_ADS);
		for (int index = 0; index < products.length; index ++) {
			
			String product = products[index];
			runOnTV(product, 25);			
		}		
	}
	
	
}
