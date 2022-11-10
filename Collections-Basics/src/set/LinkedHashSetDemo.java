package set;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		// NO Duplicates 
		// Insertion ORder - Maintained
		LinkedHashSet<Integer> numbers = new LinkedHashSet<>();
		
		numbers.add(1);numbers.add(5);numbers.add(10);
		numbers.add(17);numbers.add(5);numbers.add(32);
		
		Iterator<Integer> iterator = numbers.iterator();
		while (iterator.hasNext()) {
			
			int number = iterator.next();
			System.out.println(number);
		}
	}
}
