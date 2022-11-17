package ternary;

public class TernaryOperatorDemo {

	public static void main(String[] args) {
		
	
		int a = 100, b = 200;
		int result = findBigNumber(a, b);
		System.out.println(
			String.format("[ %d, %d] - the bigger number is %d", a, b, result));
	
		result = (a > b) ? a : b;
		System.out.println(
				String.format("[ %d, %d] - the bigger number is %d", a, b, result));
		
		int smallNumber = (a > b) ? b : a;
		System.out.println(
				String.format("[ %d, %d] - the small number is %d", a, b, smallNumber));

		smallNumber = (a < b) ? a : b;
		System.out.println(
				String.format("[ %d, %d] - the small number is %d", a, b, smallNumber));
		
		int c = 70, d = 90, x = 140, y = 100;
		result = (a > b) ? (c < d ? d : c) : (x >  y ? x : y);
		System.out.println("Outcome " + result);
		
	}
	
	static int findBigNumber(int a, int b) {
		
		if (a > b) {
			return a;
		}else {
			return b;
		}
	}
	
	
}
