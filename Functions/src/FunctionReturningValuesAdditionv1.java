
public class FunctionReturningValuesAdditionv1 {

	public static void main(String[] args) {

		add(10, 20);
		add(40, 10);
		
//		System.out.println("C's value is " + c);
		
	}
	
	static void add(int a, int b) {

		int c = a + b;
		
		System.out.println("Addition of " 
				+ a + " and " 
					+ b + " is " + c);
	}
}
