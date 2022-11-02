
public class FunctionWithoutParameters {

	public static void main(String[] args) {
		
		doSomething();
		
		doSomeMoreThing("Hello", 100, 12.54F, '%', false);
		
//		doSomeMoreThing("fdfd", "e33", 2.3F, 'A', false);
		// CORRECT
		
		// One argument less
//		doSomeMoreThing("Hello", 100, 12.54F, '%');
		
//		doSomeMoreThing("Hello", 100, 12.54F, '%', "more param1" , "more param2");
			
	}
	
	static void doSomething(){
		
		System.out.println("This is going to do something...");
	}
	
	static void doSomeMoreThing(
		String str, int i, float f, char c, boolean b) {
		
		System.out.println(str);
		System.out.println(i);
		System.out.println(f);
		System.out.println(c);
		System.out.println(b);
	}
}
