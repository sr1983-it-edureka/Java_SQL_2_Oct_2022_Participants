
public class TypeConversionDemo1 {

	public static void main(String[] args) {
		
		// Integer
		// byte, short, int, long
		System.out.println(100);
		// INT
		
		// Implicit Type Conversion
		byte b1 = 100; // byte b1 = (byte)100;
		short s1 = 100;
		int i1 = 100;
		long l1 = 100;
		
		
		
		// Index 
		// 0 0 0 0 0 0 0 0
		// 1 1 1 1 1 1 1 1
		// -128 +127
		// Explicity type casting
		byte b2 = (byte)140;
		System.out.println(b2);
		short s2 = 130;
		int i2 = 130;
		long l2 = 130;
		
		// Ok to have data loss
		// NOT ok to have data loss
		
//		System.out.println(1.23);
		
		// Salary [OK with this]
		// 12500.57 -> 12501
		// 12500.34 -> 12500
		
		// Square Root 
		// 26 -> 5.09901
		// 26 -> 5 [OK with this]
		double outcome = Math.sqrt(26);
		System.out.println(outcome);
		
		
//		long l3 = 123456789;
		
		byte b4 = 1;
	}
}
