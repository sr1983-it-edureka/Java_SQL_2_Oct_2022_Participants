
public class EmployeeDemo {

	public static void main(String[] args) {
		
//		Employee ramesh = new 
//		display();

		Employee.createEmployees();
//		Employee ramesh = new Employee("", "");
//		ramesh.createEmployees();
		
		Employee akash = new Employee("Akash", "101");
		akash.display();
				
		System.out.println("Ttoal Employee Count " 
				+ Employee.totalEmployeeCount);
		System.out.println("Ttoal Employee Count " 
				+ akash.totalEmployeeCount2);

		Employee jagan = new Employee("Jagan", "102");
		jagan.display();
		jagan.createEmployees();

		System.out.println("Ttoal Employee Count " 
				+ Employee.totalEmployeeCount);
		System.out.println("Ttoal Employee Count " 
				+ jagan.totalEmployeeCount2);

		Employee vidhya = new Employee("Vidhya", "103");
		vidhya.display();
		
		System.out.println("Ttoal Employee Count " 
				+ Employee.totalEmployeeCount);
		System.out.println("Ttoal Employee Count " 
				+ vidhya.totalEmployeeCount2);
	}
}
