
public class LogicalOperators_AND {

	public static void main(String[] args) {
		
	
		boolean employeeHasStayedMoreThanAYear = false;
		
		// A, B, C
		char rating = 'B';
		
		// Bonus is only applicable when the two conditions are
		// satisfied
		// Conditions - 
		if (employeeHasStayedMoreThanAYear == true && 
			rating == 'A') {
			System.out.println("Bonus Applicable");
		}else {
			System.out.println("Bonus NOT Appplicable...");
		}
		
	}
}
