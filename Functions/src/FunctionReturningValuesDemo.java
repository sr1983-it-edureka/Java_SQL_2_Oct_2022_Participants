
public class FunctionReturningValuesDemo {

	public static void main(String[] args) {
		
		int a = findTotalNoOfAttendees(); 
		float f = getInterestValue();
		
		char c = getLastAlphabet();
		
		String[] colors = getFavColors();
		
		boolean b = isTomorrowHoliday();
		
		noReturnFunction();
	}
	
	static int findTotalNoOfAttendees() {
		
		// 
				
		return 25;
	}
	
	static float getInterestValue() {
		
		float interestValue = 8.24F;
		
		return interestValue;
	}
	
	static char getLastAlphabet() {
		return 'Z';
	}
	
	static String[] getFavColors() {
		
		String[] favColors = {"Green", "Blue", "Orange"};
		return favColors;
	}
	
	static boolean isTomorrowHoliday() {
		return false;
	}
	
	static void noReturnFunction() {
		
		System.out.println("I am not returning anything");
		
//		return;
	}
}
