
public class IFElseDemo2 {

	public static void main(String[] args) {
		
//		int a = 10;
		
		// 1 - 7
		// 1 - Monday, 2 - Tuesday ... 7-Sunday
		
		int dayOfWeek = 6;
		
		if (dayOfWeek == 1 || dayOfWeek == 2 
				|| dayOfWeek == 3 || dayOfWeek == 4
					|| dayOfWeek == 5) {
			System.out.println("Weekday !....");
		}else {
			System.out.println("Weekend ....");
		}
		
	}
	
}
