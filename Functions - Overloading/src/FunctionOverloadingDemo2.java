
public class FunctionOverloadingDemo2 {

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
		
		finalResult = add(x, y, z);
		System.out.println("Result is " + finalResult);	
		
		// 4 numbers
		
		int m = 10, n = 20, p = 30,  q = 40;
		finalResult	= add(m, n, p, q);
		System.out.println("Result is " + finalResult);	
	
		float f = add(10.12F, 11.23F);
		System.out.println("Result is " + f);
		
	}
	
	static int add(int a, int b) {

		int c = a + b;
				
		return c;
	}	
	
	static int add(int a, int b, int c) {

		int d = a + b + c;
				
		return d;
	}	

	static int add(int a, int b, int c, int d) {

		int e = a + b + c + d;
				
		return e;
	}	
	

	static float add(float a, float b) {

		float c = a + b;
				
		return c;
	}
	
	
}
