
public class ArrayErrorScenario {

	public static void main(String[] args) {
		
		// Length - 6
		// Index [0-5]
		int numbers[] = {1, 3, 11, 23, 55, 77};
		
		int firstElement = numbers[0];
		System.out.println("First Element ->" + firstElement);
		
		// 7 / 2 -> 3.5 -> 3
		// 6 / 2 -> 3
		int middleIndex = (numbers.length / 2);
		
		int middleElement = numbers[middleIndex];
		System.out.println("Middle Element is " + middleElement);
	
		int lastElementIndex = (numbers.length);
		int lastElement = numbers[lastElementIndex];
		System.out.println("Last Element is " + lastElement);
	
	}
}
