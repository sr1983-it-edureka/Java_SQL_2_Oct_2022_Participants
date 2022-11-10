
public class StringFormatDemo {

	public static void main(String[] args) {
		
		int x = 10;
		float f = 9.87F;
		
		String s1 = "Edureka";
		String s2 = "CTS";
		
		System.out.println("X is " + x + ", F is " + f + ", "
				+ "Str1 is " + s1 + ", Str2 is " + s2);
		
		System.out.println(String.format(
			"X is %d, F is %f, S1 is %s and S2 is %s", x, f, s1, s2));
	}
}
