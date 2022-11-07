package throwusage;
import java.util.Scanner;

public class ThrowKeywordUsageV1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter number 1");		
		
		if (scanner.hasNextInt()) {

			int x = scanner.nextInt();

			System.out.println("Enter number 2");
			
			if (scanner.hasNextInt()) {

				int y = scanner.nextInt();

				try {
					int z = (x / y);	
					System.out.println("Value of z is " + z);
				}catch (Exception e) {
					e.printStackTrace();
				}
				
			}else {
				System.out.println("Number 2 is incorrect. Enter integer values only");				
			}
			
		}else {
			
			System.out.println("Number 1 is incorrect. Enter integer values only");
		}
		
		
	}
}
