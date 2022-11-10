
public class FinalUsageInMethods {

	public static void main(String[] args) {
		
		CTS cts = new CTS();
		System.out.println(cts.getCompanyName());
	}
}

class CTS {
	
	public final String getCompanyName() {
		return "CTS";
	}
}

class X extends CTS {
	
//	public String getCompanyName() {
//		return "Google";
//	}
	
}
