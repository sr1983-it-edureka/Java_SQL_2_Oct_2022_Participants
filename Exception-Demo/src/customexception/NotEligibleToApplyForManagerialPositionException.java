package customexception;

import java.util.ArrayList;

public class NotEligibleToApplyForManagerialPositionException 
	extends Exception {

	int rejectionReasonsCount;
	ArrayList<String> rejectionReasons;
	
	public NotEligibleToApplyForManagerialPositionException(){
		rejectionReasons = new ArrayList<>();
	}
	
	public void addRejectionReason(String rejectionReason) {
		
		rejectionReasons.add(rejectionReason);
	}
	
	public ArrayList<String> getRejectionReasons() {
		return rejectionReasons;
	}
	
	public int getRejectionsCount() {
		return rejectionReasons.size();
	}
}
