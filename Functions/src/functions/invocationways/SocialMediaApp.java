package functions.invocationways;

public class SocialMediaApp {

	String name;
	long noOfClients;

	public SocialMediaApp(String name, long noOfClients) {
		
		this.name = name;
		this.noOfClients = noOfClients;
	}
	
	void display() {
		
		System.out.println(String.format(
			"Name is %s and No.of.Clients is %d", name, noOfClients));
	}
}
