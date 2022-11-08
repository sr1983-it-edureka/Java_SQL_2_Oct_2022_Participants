import java.util.ArrayList;
import java.util.Iterator;

public class ListIterationDemo2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> randomNumbers 
			= CollectionSamples.randomNumbers();
		
		Iterator<Integer> iterator 
			= randomNumbers.iterator();
		
		while (iterator.hasNext()) {
			
			Integer randomNo = iterator.next();
			System.out.println("Random No->" + randomNo);
		}
		
	}
}
