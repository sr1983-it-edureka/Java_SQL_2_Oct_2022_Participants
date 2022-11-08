package cts.development.managers;


import cts.development.testers.TestingEnvironment;

import cts.advertisments.*;

public class Manager {

	Advertisement ad;
	
	TestingEnvironment te;
	
	Ad1 ad1;
	Ad2 ad2;
	
	Ad7 ad7;
	Ad10 ad10;
	
	public static void main(String[] args) {
		
		String [] products  = {"Telegram", "Health care Product"};
		
		Advertisement advertisment = new Advertisement();
		advertisment.displayProducts(products);
		
		System.out.println(advertisment.COMPANY_NAME);
//		System.out.println(advertisment.noOfSuccessfulAds);
		
//		System.out.println(advertisment.NO_OF_FAILURE_ADS);
	}
}
