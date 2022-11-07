import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		System.out.println("Enter your age");
		
		// System.in -> Refers default input device -> Keyboard
		Scanner scanner = new Scanner(System.in);
		
		int age = scanner.nextInt();
		
		System.out.println("The age you entered is " + age);
	}
}
