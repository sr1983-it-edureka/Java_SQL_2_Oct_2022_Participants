import java.util.Scanner;

public class ScannerDemo2 {

	public static void main(String[] args) {
		
		
		System.out.println("Enter your age");
		
		// System.in -> Refers default input device -> Keyboard
		Scanner scanner = new Scanner(System.in);
		
		if (scanner.hasNextInt()) {

			int age = scanner.nextInt();
			System.out.println("The age you entered is " + age);
		}else {
			
			System.out.println("Enter only integer values !!!");
		}
		
	}
}
