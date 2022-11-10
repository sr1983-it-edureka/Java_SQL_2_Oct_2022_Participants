package cts.advertisments;

public class Campaign {

	public static void main(String[] args) {
		
		Advertisement advertisement = new Advertisement();
		advertisement.runOnTV("", 1);
		advertisement.myDefaultAccessMethod();
		
//		advertisement.myPrivateMethod();
		
//		System.out.println(advertisement.noOfSuccessfulAds);
		System.out.println(advertisement.COMPANY_NAME);
		
		System.out.println(advertisement.NO_OF_FAILURE_ADS);
//		System.out.println(advertisement.OPERATION_OUTCOME);
	}
}
