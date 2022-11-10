package functions.invocationways;

public class FunctionCallByReference {

	public static void main(String[] args) {
		
		SocialMediaApp whatsapp = 
				new SocialMediaApp("Whatsapp", 12345678);		
		whatsapp.display();
		
		testFunction(whatsapp);
		
		whatsapp.display();
	}
	
	static void testFunction(SocialMediaApp app) {
		
		app.noOfClients = 0;
		
		app.display();
	}
}

