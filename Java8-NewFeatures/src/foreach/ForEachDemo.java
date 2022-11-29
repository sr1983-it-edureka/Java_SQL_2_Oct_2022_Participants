package foreach;

import java.util.ArrayList;
import java.util.List;

public class ForEachDemo {

	public static void main(String[] args) {
		
		demo1();
	}
	
	static void demo1() {
		
		
		List<Integer> numbers = new ArrayList<>();
		
		for (int index = 1; index <= 10; index ++) {
			numbers.add(index);
		}

		
		numbers.forEach((item) -> {
			System.out.println(item);
		});
	}
}
