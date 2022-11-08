import java.util.ArrayList;

public class ListIterationDemo {

	public static void main(String[] args) {
		
		ArrayList<String> colors 
			= CollectionSamples.colorsList();
		
		// colors ---> indirectly comes from Iterable
		// so iterating over the elements via enhanced-for-loop
		// is possible
		// Enhanced For Loop
		for (String color : colors) {
			
			System.out.println("Color is " + color);
		}
		
		
		// Traditional for - loop
		
		/*for (int index = 0; index < listOfColors.size(); index ++) {
			
			String color = listOfColors.get(index);
			
			System.out.println("Color is " + color);
		}*/
		
	}
}
