import java.util.Scanner;

public class CollectUserInputsV1 {

	public static void main(String[] args) {
		
		System.out.println("Enter your name");
		
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.nextLine();
		
		System.out.println("Enter you age");
		
		int age = 0;
		if (scanner.hasNextInt()) {
			age = scanner.nextInt();	
//			scanner.nextLine();
		}else {
			System.out.println("Enter numbers only");
		}
		
		System.out.println("Enter you salary");		
		float salary = 0.0F;
		if (scanner.hasNextFloat()) {
			salary = scanner.nextFloat();			
		}else {
			System.out.println("Enter proper values in decimals (Eg - 123.45)");
		}
	
		System.out.println("Values collected are : ");
		System.out.println("Name is " + name);
		System.out.println("Age is " + age);
		System.out.println("Salary is " + salary);
	}
}
