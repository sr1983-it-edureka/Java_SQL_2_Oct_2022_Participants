
public class FunctionOverloadingDemo1 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		int c = add(10, 20);
		
		// x, y, z
		
		int x = 434;
		int y = 43;
		int z =  32;
		
		// Options
		// Option 1
		
		int result1 = add(x, y);
		int finalResult = add(z, result1);
		System.out.println("Result is " + finalResult);		
		// Option 2
		
		finalResult = addThreeNumbers(x,  y,  z);
		System.out.println("Result is " + finalResult);	
		
		// 4 numbers
		
		int m = 10, n = 20, p = 30,  q = 40;
		finalResult	= addFourNumbers(m, n, p, q);
		System.out.println("Result is " + finalResult);	
		
	}
	
	static int add(int a, int b) {

		int c = a + b;
		
		System.out.println("Addition of " 
				+ a + " and " 
					+ b + " is " + c);
		
		return c;
	}	
	
	static int addThreeNumbers(int a, int b, int c) {

		int d = a + b + c;
		
		System.out.println("Addition of " 
				+ a + " and " 
					+ b + "and " + c + " is " + d);
		
		return d;
	}	

	static int addFourNumbers(int a, int b, int c, int d) {

		int e = a + b + c + d;
		
		System.out.println("Addition of " 
				+ a + " and " 
					+ b + "and " + c + "and " + d + " is " + e);
		
		return e;
	}	
	
}
