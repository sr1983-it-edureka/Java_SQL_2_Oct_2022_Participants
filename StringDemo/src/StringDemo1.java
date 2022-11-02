
public class StringDemo1 {

	public static void main(String[] args) {
		
		// A, B, C
		char[] appraisalRatings = {'A', 'C', 'B'};
	
		// Excellent, Good, Average, Bad
		
		int a = 10;
		float f = 1.23F;
		boolean b = false;
		
		String rating = "Excellent";
		
		String nameOfBatch = "Java & SQL";
		
		String favouriteColor = "Green";
		
		String [] appraisalRatingsStr 
			= {"Excellent", "Good", "Average", "Bad"};
		
		// Start -> 0
		// End -> (Length - 1) [<]
		for (int index = 0; index < appraisalRatingsStr.length; index ++) {
			
			System.out.println("Appraisal Rating is " 
					+ appraisalRatingsStr[index]);
		}
	}
	
}
