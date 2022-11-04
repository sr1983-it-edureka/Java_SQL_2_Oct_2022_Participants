
public class ApplicationProgrammer {

	String name;
	String primaryProgrammingLanguage;
	String certifications[];
	
	ApplicationProgrammer(String lName, String lPrimaryProgrammingLanguage,
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
			
			// 0, 1, 2, 3
			
			/*if (index == (certifications.length - 1)) {
				// Comma NOT needed
			}else {
				// Comma needed
				contents.append(" , ");
			}*/
			
			if (! (index == (certifications.length - 1))) {
				// Comma needed
				contents.append(" , ");
			}
			
			/*if (index != (certifications.length - 1)) {
				// Comma NEEDED
			}else {
				//Comma NOT needed
			}*/
		}
		contents.append("]");
		
		
		System.out.println(contents.toString());
	}
}
