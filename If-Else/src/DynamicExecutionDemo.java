
public class DynamicExecutionDemo {

	public static void main(String[] args) {
		
		int a = 10;
		System.out.println(a);
		
		if (a == 10) {
			int b;
			b = 20;
			System.out.println(b);			
		}else {
	
			int c = 30;
			c = 40;
			System.out.println(c);			
		}
		
		int if1 = 10;
		int else1 = 20;
	}
}
