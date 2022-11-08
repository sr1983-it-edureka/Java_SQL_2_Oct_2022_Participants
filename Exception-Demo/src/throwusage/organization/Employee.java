package throwusage.organization;

import customexception.NotEligibleToApplyForManagerialPositionException;

public class Employee {

	String name;
	Designation designation;
	int projectsCount;

	public Employee(String lName, Designation lDesignation) {
		
		name = lName;
		designation = lDesignation;
	}
	
	public Employee(String lName, Designation lDesignation, int lProjectsCount) {
		
		this(lName, lDesignation);
		
		projectsCount = lProjectsCount;
	}	
	
	void display() {
		
		System.out.println("Name is " + name);
		System.out.println("Designation is " + designation);
	}
	
	void applyForManagerPosition() 
		throws NotEligibleToApplyForManagerialPositionException {
		
		NotEligibleToApplyForManagerialPositionException exception
			= null;
		
		// First Check
		// TEAM_LEAD, Team Lead, TEAM LEAD
		if (!designation.equals(Designation.TEAM_LEAD)) {
			
			String rejectionReason = name + ", your designation is " + designation
				+ ", you are not eligible to apply for the manager's role";
			
			exception = new NotEligibleToApplyForManagerialPositionException();
			
			exception.addRejectionReason(rejectionReason);
			
			
		}
		
		
		// Second check
		
		if (projectsCount < 3) {
			
			String rejectionReason = "You have completed only " 
					+ projectsCount + " projects. Min projects completion must be"
					+ " atleast 3";
			
			
			if (exception == null) {
				exception = new NotEligibleToApplyForManagerialPositionException();				
			}
			
			exception.addRejectionReason(rejectionReason);
		}
		
		if (exception != null) {
			throw exception;
		}else {
			System.out.println(name + " applied for manager position");
			System.out.println("Wait for atleast a week's time and then you will defn hear from us.");
			
		}		
	}
}
