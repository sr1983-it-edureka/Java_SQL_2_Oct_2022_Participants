package throwusage;
import java.util.Scanner;

public class ThrowKeywordUsageV2 {

	public static void main(String[] args) throws Exception{

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter number 1");		
		
		if (scanner.hasNextInt()) {

			int x = scanner.nextInt();

			System.out.println("Enter number 2");
			
			if (scanner.hasNextInt()) {

				int y = scanner.nextInt();

				if (y == 0) {
					
					Exception e = new Exception(
							"Y is 0, Divide by Zero is not mathematically possible");					
					throw e;
				}
				
			}else {
				System.out.println("Number 2 is incorrect. Enter integer values only");				
			}
			
		}else {
			
			System.out.println("Number 1 is incorrect. Enter integer values only");
		}
		
		
	}
}
