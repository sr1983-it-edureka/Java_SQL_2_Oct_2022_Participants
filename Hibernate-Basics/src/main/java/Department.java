import java.util.ArrayList;

public class Department {

	ArrayList<Employee> employees;
	
	String name;
	
	public Department(String name) {
		this.name = name;
		
		this.employees = new ArrayList<Employee>();
	}
	
	public void addEmployee(Employee employee) {
		
		this.employees.add(employee);
	}
	
	public ArrayList<Employee> getEmployees(){
		
		return employees;
	}
	
	public String toString() {
		return name;
	}
}
