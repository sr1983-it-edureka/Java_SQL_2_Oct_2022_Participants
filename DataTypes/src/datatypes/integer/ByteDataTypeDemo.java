package datatypes.integer;

public class ByteDataTypeDemo {

	public static void main(String[] args) {
		
		// Size
		byte countOfFamilyMembers = 10;
		
		System.out.println(countOfFamilyMembers);
	
		System.out.println("Size of byte data type -->" + Byte.SIZE);

		// 8 bits / 1 Byte
		// 2 pow (8) -> 256
		// 0 - 256
		// 1 bit - Sign (+ , 1)
		// 2 (pow) 7 -> 128
		// Range 
		//	-128 -------  +127
				
		byte someNegativeNo = -100;
		
		System.out.println("Min Range is " + Byte.MIN_VALUE);
		System.out.println("Max Range is " + Byte.MAX_VALUE);
		
		
	}
}
