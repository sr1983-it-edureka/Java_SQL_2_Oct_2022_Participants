package throwusage.organization;

public class Employee {

	String name;
	Designation designation;

	public Employee(String lName, Designation lDesignation) {
		
		name = lName;
		designation = lDesignation;
	}
	
	void display() {
		
		System.out.println("Name is " + name);
		System.out.println("Designation is " + designation);
	}
	
	void applyForManagerPosition() throws Exception {
		
		// TEAM_LEAD, Team Lead, TEAM LEAD
		if (!designation.equals(Designation.TEAM_LEAD)) {
			
			String errorMessage = name + ", your designation is " + designation
				+ ", you are not eligible to apply for the manager's role";
			
			Exception e = new Exception(errorMessage);
			throw e;
		}else {
			System.out.println(name + " applied for manager position");
			System.out.println("Wait for atleast a week's time and then you will defn hear from us.");
			
		}		
	}
}
