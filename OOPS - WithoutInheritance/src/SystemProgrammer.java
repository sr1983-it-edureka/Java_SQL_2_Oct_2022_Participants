
public class SystemProgrammer {

	String name;
	String primaryProgrammingLanguage;
	boolean networkingSkills;
	boolean deviceDriversSkills;
	boolean memoryManagementSkills;
	boolean internetDriversSkills;
	
	String certifications[];
	
	public SystemProgrammer(String lName, String lPrimaryProgrammingLanguage,
		boolean lNetworkingSkills, boolean lDeviceDriversSkills, boolean lMemoryManagementSkills,
			boolean lInternetDriversSkills, String [] lCertifications) {
		
		name = lName;
		primaryProgrammingLanguage = lPrimaryProgrammingLanguage;
		networkingSkills = lNetworkingSkills;
		deviceDriversSkills = lDeviceDriversSkills;
		memoryManagementSkills = lMemoryManagementSkills;
		internetDriversSkills = lInternetDriversSkills;
		
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
		
		contents.append("Networking Skills ->").append(networkingSkills).append(" , ");
		contents.append("Device Drivers Skill ->").append(deviceDriversSkills).append(", ");
		contents.append("Memory Management Skills ->").append(memoryManagementSkills).append(",");
		contents.append("Internet Drivers Skkill ->").append(internetDriversSkills);
		
		System.out.println(contents.toString());	
		System.out.println();
		
	}
}
