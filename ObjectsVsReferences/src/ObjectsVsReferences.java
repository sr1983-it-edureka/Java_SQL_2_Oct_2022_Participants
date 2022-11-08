
public class ObjectsVsReferences {

	public static void main(String[] args) {
		
		// i is a variable
		// i refers to data (10)
		// i can be called as "reference"
		int i = 10;
		
		i = 15;
		
		i = 10;
		
		
		// dellObject is an object
		// dellObject is refering to some object []
		// dellObject is a reference
		Laptop dellLaptop = new Laptop("Dell", 150000);
		System.out.println(dellLaptop);
		dellLaptop.display();
		
		Laptop samsungLaptop = new Laptop("Samsung", 125000);
		System.out.println(samsungLaptop);
		samsungLaptop.display();
		
		Laptop backupLaptop = dellLaptop;
		backupLaptop.display();
		
		dellLaptop = samsungLaptop;
		dellLaptop.display();
		samsungLaptop.display();
		
		System.out.println("---------------");
		System.out.println("Dell ->" + dellLaptop);
		System.out.println("Samsung ->" + samsungLaptop);
		System.out.println("Backup Laptop ->" + backupLaptop);
	}
}

