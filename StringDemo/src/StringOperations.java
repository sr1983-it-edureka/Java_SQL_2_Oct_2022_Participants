
public class StringOperations {

	public static void main(String[] args) {
		
		lengthDemo();
		findCharactersDemo();
		indexOfCharDemo();
	}

	static void lengthDemo() {
		
		String welcomeMessage = "Welcome Everyone";
		
		int length = welcomeMessage.length();
		
//		char length2 = welcomeMessage.length();
		
		System.out.println("Length of the string is " + length);
		
	}
	
	// :-)
	static void findCharactersDemo(){
		
		// Name
		// Arguments [How many arguments, What about the data types
		// Return type
		String welcomeMessage = "Welcome Everyone";
		
		int index = 5;
		char result = welcomeMessage.charAt(index);
		System.out.println("The character that is present at index " 
				+ index + " is " + result);
			
	}
	
	static void indexOfCharDemo() {
		
		String welcomeMessage = "Welcome Everyone";
		
		// Know the character, the index/position
		
		char someChar = 'z';
		int positionOfChar = welcomeMessage.indexOf(someChar);
		
		System.out.println("The character " + someChar 
				+ " is present in the position " + positionOfChar);
	}
}
