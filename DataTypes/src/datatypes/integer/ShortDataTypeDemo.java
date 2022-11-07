package datatypes.integer;

public class ShortDataTypeDemo {

	public static void main(String[] args) {
		
		// Size
		short countOfFamilyMembers = 10;
		
		System.out.println(countOfFamilyMembers);
	
		System.out.println("Size of short data type -->" + Short.SIZE);

		// 16 bits / 2 Byte
		// 2 pow (16) -> 65536
		// 1 bit - Sign (+ , 1)
		// 2 (pow) 15 -> 32,768
		// Range 
		//	-32,768 -------  +32,767
						
		System.out.println("Min Range is " + Short.MIN_VALUE);
		System.out.println("Max Range is " + Short.MAX_VALUE);
				
	}
}
