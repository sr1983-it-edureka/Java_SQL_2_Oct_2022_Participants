package throwusage.organization;

import java.util.ArrayList;

import customexception.NotEligibleToApplyForManagerialPositionException;

public class EmployeeDemo3 {

	public static void main(String[] args) throws Exception {


		try {
			Employee vivek = new Employee("Vivek", 
				Designation.JUNIOR_PROGRAMMER, 2);
			vivek.applyForManagerPosition();					
		}catch (NotEligibleToApplyForManagerialPositionException e) {
			
			System.out.println("Rejected for " 
			+ e.getRejectionsCount() + " reason(s)");
			
			for (String rejectionReason : e.getRejectionReasons()) {
				System.out.println("Message -> " + rejectionReason);				
			}			
//			e.printStackTrace();
		}
		
		
		try {
			Employee anil = new Employee("Anil", Designation.TEAM_LEAD, 10);
			anil.applyForManagerPosition();			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
