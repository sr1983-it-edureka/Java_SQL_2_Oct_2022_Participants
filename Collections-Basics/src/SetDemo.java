import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {

	public static void main(String[] args) {
		
		// Duplicates 
		// "hash" - Dont maintain ordering
		HashSet<Integer> numbers = new HashSet<>();
		
		numbers.add(1);numbers.add(5);numbers.add(10);
		numbers.add(17);numbers.add(5);numbers.add(32);
		
		Iterator<Integer> iterator = numbers.iterator();
		while (iterator.hasNext()) {
			
			int number = iterator.next();
			System.out.println(number);
		}
	}
}
