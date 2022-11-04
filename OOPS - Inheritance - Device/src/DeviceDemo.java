
public class DeviceDemo {

	public static void main(String[] args) {
		
		Laptop arunLaptop = new Laptop(
			"Dell", "Dell-123", "White", true);
		arunLaptop.display();
		
		Laptop anushaLaptop = new Laptop(
			"Lenova", "Lenova-123", "Black", false);
		anushaLaptop.display();
		
		Mobile manuMobile = new Mobile(
			"Samsung", "Galaxy-123", "Gold", (byte)1);
		manuMobile.display();
		
		Mobile swetaMobile = new Mobile(
			"Apple", "Apple-123", "Black", (byte)2);
		swetaMobile.display();
		
		SmartTelevision mi = new SmartTelevision(
			"MI", "MI-123", "Black", (byte)2);
		mi.display();
		
		SmartTelevision sony = new SmartTelevision(
			"Sony", "Sony-123", "Black", (byte)3);
		sony.display();
		
		
				
	}
}
