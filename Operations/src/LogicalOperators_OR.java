
public class LogicalOperators_OR {

	public static void main(String[] args) {
		
		int moneyInBankAccount = 50000;
		boolean friendsAvailability = false;
		
		if (moneyInBankAccount >= 100000 ||
			friendsAvailability == true) {
			System.out.println("Go for a trip");
		}else {
			System.out.println("No trip...");
		}
		
	}
}
