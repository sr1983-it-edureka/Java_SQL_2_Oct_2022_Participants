
class Laptop{
	
	String color;
	String model;
	
	Laptop(String lColor, String lModel){
		color  = lColor;
		model = lModel;
	}
}

public class PrintDemoOnDataTypes {

	public static void main(String[] args) {
		
		int age = 25;
		System.out.println(age);
		
		float bonus = 2.56F;
		System.out.println(bonus);
		
		int[] myFavNumbers = {1,3, 6};
		System.out.println(myFavNumbers);
		
		String[] myDevices  = {"lenovaLaptop", 
				"4TB Hard Drive", "Samsung Television"};
		System.out.println(myDevices);
		
		Laptop myLaptop = new Laptop("Black", "lenova Model");
		System.out.println(myLaptop);
		
	}
}
