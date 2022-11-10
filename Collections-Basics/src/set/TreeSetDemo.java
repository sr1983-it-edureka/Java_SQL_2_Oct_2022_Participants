package set;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		namesSet();
//		numbersSet();
	}
	
	static void namesSet() {
		
		// ASCII Chart -
		// https://www.cs.cmu.edu/~pattis/15-1XX/common/handouts/ascii.html
		
		TreeSet<String> names = new TreeSet<>();
		
		names.add("Sweta");names.add("Manu");names.add("Aekta");
		names.add("sweta");
		
		names.add("Chopra");
		names.add("Manu");
		names.add("Khan");
		
		Iterator<String> iterator = names.iterator();
		while (iterator.hasNext()) {
			
			String name = iterator.next();
			System.out.println(name);
		}	
	}
	
	
	static void numbersSet() {
		TreeSet<Integer> numbers = new TreeSet<>(Collections.reverseOrder());
		
		numbers.add(1);numbers.add(5);numbers.add(-10);
		numbers.add(17);numbers.add(-5);numbers.add(32);
		numbers.add(47);numbers.add(-54);numbers.add(98);
		
		Iterator<Integer> iterator = numbers.iterator();
		while (iterator.hasNext()) {
			
			int number = iterator.next();
			System.out.println(number);
		}

	}	
}
