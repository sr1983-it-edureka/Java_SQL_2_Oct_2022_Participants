package functions.invocationways;

public class FunctionCallByValue {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		
		System.out.println(String.format(
			"X is %d and Y is %d", x, y));
		
		testFunction(x, y);
		
		System.out.println(String.format(
				"X is %d and Y is %d", x, y));
	}
	
	static void testFunction(int a, int b) {

		System.out.println(String.format(
			"A is %d and B is %d", a, b));
		
		a = 100;
		b = 200;

	}
	
}
