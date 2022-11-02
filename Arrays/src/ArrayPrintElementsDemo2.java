
public class ArrayPrintElementsDemo2 {

	public static void main(String[] args) {
		
		// Movies - Terminator 1, Terminator 2, Terminator 3
		
		char [] appraisalRatings = {'A', 'B', 'A', 'C'};
		
		float [] movieRatings = 	
			{8.1F, 8.5F, 6.5F, 4.4F, 6.99F, 3.54F, 2, 98F, 8.3F};

		int noOfElements = movieRatings.length;
		System.out.println("No of elements in the array ->" + noOfElements);
		
		// Task
		// access array element, printing array element
		
		for (int arrayIndex = 0; arrayIndex < noOfElements; arrayIndex ++ ) {
		
			float movieRating = movieRatings[arrayIndex];
			System.out.println("Movie Rating is ->" + movieRating);
		}
	}
}
