import java.util.ArrayList;

public class ListCollectionDemo {

	public static void main(String[] args) {
				
//		CollectionSamples samples = new CollectionSamples();

		ArrayList<String> listOfColors = CollectionSamples.colorsList();		
		
		// Iterating
		
		for (int index = 0; index < listOfColors.size(); index ++) {
			
			String color = listOfColors.get(index);
			
			System.out.println("Color is " + color);
		}
		
		ArrayList<Integer> randomNumbers= CollectionSamples.randomNumbers();
		
		for (int index = 0; index < randomNumbers.size(); index ++) {
			
			int randomNumber = randomNumbers.get(index);
			
			System.out.println("Random number is " + randomNumber);
		}
	}
}
