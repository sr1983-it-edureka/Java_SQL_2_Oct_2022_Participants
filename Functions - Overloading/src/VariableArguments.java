
public class VariableArguments {

	public static void main(String[] args) {
		
		int finalResult = add(1, 2, 3, 4, 5, 6, 7);
		System.out.println(finalResult);
		finalResult = add(
				1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
		System.out.println(finalResult);

	}
	
	// int a, int b, int c, int d
	// int [] numbers = {1, 2,3, ,5, 56,6 }
	static int add(int ... numbers) {

		int totalSum = 0;
		
		int length = numbers.length;
		for (int index = 0; index < length; index ++) {
			
			int number = numbers[index];
			totalSum = totalSum + number;
		}
		
		return totalSum;
	}
	
}
