
public class Main {

	public static void main(String[] args) {
		
		Department sales = new Department("Sales");
		Department hr = new Department("HR");
		Department engineering = new Department("Engineering");
		
		Employee kumar = new Employee("Kumar", sales);
		Employee punith = new Employee("Punith", sales);
		
		Employee raghu = new Employee("Raghu", hr);
		Employee sathish = new Employee("Sathish", hr);
		
		Employee ramesh = new Employee("Ramesh", engineering);
		Employee sukesh = new Employee("Sukesh", engineering);
		
		System.out.println(sales.getEmployees());
	}
}
