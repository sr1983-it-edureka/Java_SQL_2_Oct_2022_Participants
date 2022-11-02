
public class FunctionReturningValuesAdditionv2 {

	public static void main(String[] args) {

		int c = add(10, 20);
		System.out.println("C's value is " + c);
		
		int d = add(40, 10);
		System.out.println("D's value is " + d);
		
	}
	
	static int add(int a, int b) {

		int c = a + b;
		
		System.out.println("Addition of " 
				+ a + " and " 
					+ b + " is " + c);
		
		return c;
	}
}
