package throwusage.organization;

public class EmployeeDemo {

	public static void main(String[] args) throws Exception {

		// ABCD-Organization
		// Rule 1
		// To be promoted to team-manager, the current designation must be
		// Team- Lead
		// Rule 2 - Employee should have atleast completed 3 projects

		try {
			Employee vivek = new Employee("Vivek", Designation.JUNIOR_PROGRAMMER);
			vivek.applyForManagerPosition();					
		}catch (Exception e) {
			e.printStackTrace();
		}

		try {
			Employee anil = new Employee("Anil", Designation.TEAM_LEAD);
			anil.applyForManagerPosition();			
		}catch (Exception e) {
			e.printStackTrace();
		}

		try {
			Employee sathish = new Employee("Sathish", Designation.SENIOR_PROGRAMMER);
			sathish.applyForManagerPosition();			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
