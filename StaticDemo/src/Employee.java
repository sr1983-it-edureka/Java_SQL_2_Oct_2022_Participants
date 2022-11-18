import java.util.ArrayList;

public class Employee {

	String name;
	String id;
	
	// Non Static variables / Regular variables
	int totalEmployeeCount2;
	
	// Static varaibles / Class-level variables
	static int totalEmployeeCount;
	
	public Employee(String name, String id) {
		
		this.name = name;
		this.id = id;
		
		incrementEmployeeCount();
	}
	
	void incrementEmployeeCount() {
		
		totalEmployeeCount = totalEmployeeCount + 1;
		totalEmployeeCount2 = totalEmployeeCount2 + 1;
	}
	
	
	void incrementSalary() {
		
		System.out.println("hello");
		
		int a = 10;
		int b = 20;
	}
	
	// Non static method / Regular method
	void display() {
		
		System.out.println(
			String.format("Name is %s and Id is %s", name, id));
	}
	
	 static ArrayList<Employee> createEmployees() {
		
		// static method can access only static variables
		Employee e1 = new Employee("E1", "1");
		Employee e2 = new Employee("E2", "2");
		Employee e3 = new Employee("E3", "3");
		Employee e4 = new Employee("E4", "4");
		Employee e5 = new Employee("E5", "5");
		
		ArrayList<Employee> employees = new ArrayList<>();
		employees.add(e1);employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
		
		
		// Static method can call only other static methods
		removeEmployees();
		
		System.out.println(totalEmployeeCount);
		
		return employees;
		
	}
	
	static void removeEmployees() {
		
	}
}
