import java.util.ArrayList;

public class ListCollectionDemo {

	public static void main(String[] args) {
				
//		createList();
		
		removeElement();
	}
	
	static void createList() {
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
	
	static void removeElement() {
		
		ArrayList<String> listOfColors = CollectionSamples.colorsList();
		
		System.out.println(listOfColors);
		
		listOfColors.remove(0);
		
		// Last element
		int lastIndex = listOfColors.size() - 1;
		listOfColors.remove(lastIndex);
		
		System.out.println(listOfColors);
	}
}
