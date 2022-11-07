
public class StringErrorScenario {

	public static void main(String[] args) {
		
		String welcome = "Welcome you all";
		
		char firstChar = welcome.charAt(0);
		System.out.println(firstChar);
		
		int lastCharIndex = welcome.length();
		char lastChar = welcome.charAt(lastCharIndex);
		System.out.println(lastChar);
	}
}
