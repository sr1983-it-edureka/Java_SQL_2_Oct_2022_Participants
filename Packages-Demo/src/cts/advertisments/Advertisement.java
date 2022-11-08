package cts.advertisments;

public class Advertisement {
	
	public String COMPANY_NAME = "Greenwich Ad Company";
	private String OPERATION_OUTCOME = "FAILURE";

	// default access / package level access
	int NO_OF_FAILURE_ADS = 5;

	void runOnTV(String product, int duration) {
		
		System.out.println("Running advertisement for product " + product 
				+  " on TV for " + duration + " seconds");
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
