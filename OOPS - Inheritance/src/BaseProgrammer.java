
// Parent Class / Base Class / Super Class
public class BaseProgrammer {

	String name;
	String primaryProgrammingLanguage;
	String certifications[];
	
	BaseProgrammer(String lName, String lPrimaryProgrammingLanguage,
			String[] lCertifications) {
			
		name = lName;
		primaryProgrammingLanguage = lPrimaryProgrammingLanguage;
		certifications = lCertifications;
	}	

	void display() {
		
		StringBuilder contents = new StringBuilder();
		
		contents.append("Name is ").append(name).append(" , ");
		contents.append("Primary Programming Language ->")
			.append(primaryProgrammingLanguage).append(" , ");
		
		contents.append("Certifications -> [");
		for (int index = 0; index <certifications.length; index ++) {
			
			String aCertification = certifications[index];
			contents.append(aCertification);
			
			
			if (! (index == (certifications.length - 1))) {
				// Comma needed
				contents.append(" , ");
			}
			
		}
		contents.append("], ");
		
		System.out.println(contents.toString());
	}
}
