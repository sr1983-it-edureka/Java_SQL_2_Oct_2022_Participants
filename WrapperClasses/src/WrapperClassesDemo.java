import java.util.ArrayList;
import java.util.HashSet;

public class WrapperClassesDemo {

	public static void main(String[] args) {
		
//		HashSet<float> set = new HashSet<>();
		
//		HashSet<Float> 
		
		int age = 25;
		
		Integer intObj = new Integer(25);
	
//		ArrayList<int> 
//		ArrayList<Integer>
		
		Float floatObj = new Float(1.23F);
		
		Character c = new Character('D');
		
		Boolean bObbj = new Boolean(true);
		
		String number = "1234";
		
		int value = Integer.parseInt(number);
		System.out.println(value);
		
		float floatValue = Float.parseFloat("123.456");
		System.out.println("Float value is " + floatValue);
	
	}
}
