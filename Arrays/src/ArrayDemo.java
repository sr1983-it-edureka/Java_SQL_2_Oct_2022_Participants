
public class ArrayDemo {

	public static void main(String[] args) {
		
		// A, B C
		char appraisalRating = 'B';
		System.out.println(appraisalRating);
		
		// 2018-A, 2019-B, 2020-A, 2021-C
		
		// Length - 4
		// Index [0 - 3]
		char [] appraisalRatings = {'A', 'B', 'A', 'C'};
		
		char firstElement = appraisalRatings[0];
		System.out.println(firstElement);
		System.out.println("First element of the array is " + firstElement);
		
		char fourthElement = appraisalRatings[3];
		System.out.println("Fourth element in the array is " + fourthElement);
		
		System.out.println("Fourth element in the array is " 
				+ appraisalRatings[3]);
	}
}
