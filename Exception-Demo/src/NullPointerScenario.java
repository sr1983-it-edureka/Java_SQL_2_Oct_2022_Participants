
public class NullPointerScenario {

	public static void main(String[] args) {
		
		String str = "Welcome you all";
		
		System.out.println(str);
		System.out.println("Length of the string " + str.length());
	
		str = "Good Morning";
		System.out.println(str);
		
	
		str = null;
		
		System.out.println(str.length());
	}
}
