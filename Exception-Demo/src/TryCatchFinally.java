
public class TryCatchFinally {

	public static void main(String[] args) {
		
		try {
			
			int c = 10 / 0;
			
			System.out.println("Witin try block");
		}catch (Exception e) {
			
			System.out.println("Witin catch block");
		} finally {
			
			System.out.println("Finally - Executed during error / no-error condition");
		}
		
		System.out.println("Outside the try-catch block");
	}
}
