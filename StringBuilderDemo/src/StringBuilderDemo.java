
public class StringBuilderDemo {

	public static void main(String[] args) {
		
		int a = 10;
		float f = 1.23F;
//		Printer printer05 = new Printer();
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("Today, we started the session around 2 PM. ");
		sb.append("Tomorrow , we dont have sessions.");
		sb.append("Today, we are learning about the usage of StringBuilder");
		
		System.out.println(sb.toString());
		System.out.println();
		
		sb.insert(25, "LEARNING OPPS");
		System.out.println(sb.toString());
		System.out.println();
		
		sb.delete(40, 70);
		System.out.println(sb.toString());
	}
}
