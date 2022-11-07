
public class ScenarioDivideBy0 {

	public static void main(String[] args) {
		
		// Segment 1
		
		int a = 10;
		int b = 0;
		
		int c = 0;
		try {
			c = a/b;			
			System.out.println("Division Operation ->" + c);
		}catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		

		// Segment 2
		int x = 30;
		int y = 40;
		
		int z = x * y;
		
		System.out.println("Multiplication Operation " + c);

		// Segemnt 3
		System.out.println("Sgement 3");
	
		// Segement 4
		
		System.out.println("Segemnt 4");
	}
}
