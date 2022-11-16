
public class Employee {

	String name;
	Department department;
	
	public Employee(String name, Department department) {
		
		this.name = name;
		
		this.department = department;		
		this.department.addEmployee(this);
	}
	
	public String toString() {
		
		return name;
	}
}
