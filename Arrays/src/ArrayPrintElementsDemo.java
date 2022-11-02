
public class ArrayPrintElementsDemo {

	public static void main(String[] args) {
		
		// Movies - Terminator 1, Terminator 2, Terminator 3
		
		char [] appraisalRatings = {'A', 'B', 'A', 'C'};
		
		float [] movieRatings = {8.1F, 8.5F, 6.5F};
		
		// Task
		// access array element, printing array element
		
		for (int counter = 1; counter <=3; counter ++) {
			
			int arrayIndex = counter - 1;
			float movieRating = movieRatings[arrayIndex];
			System.out.println("Movie Rating is ->" + movieRating);
		}
	}
}
