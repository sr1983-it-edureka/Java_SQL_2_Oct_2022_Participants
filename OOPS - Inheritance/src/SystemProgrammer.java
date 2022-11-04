
// Child Class
public class SystemProgrammer extends BaseProgrammer {

	boolean networkingSkills;
	boolean deviceDriversSkills;
	boolean memoryManagementSkills;
	boolean internetDriversSkills;
	
	
	public SystemProgrammer(String lName, String lPrimaryProgrammingLanguage,
		boolean lNetworkingSkills, boolean lDeviceDriversSkills, 
		boolean lMemoryManagementSkills, boolean lInternetDriversSkills, 
		String [] lCertifications) {
		
		super(lName, lPrimaryProgrammingLanguage, lCertifications);
		
		networkingSkills = lNetworkingSkills;
		deviceDriversSkills = lDeviceDriversSkills;
		memoryManagementSkills = lMemoryManagementSkills;
		internetDriversSkills = lInternetDriversSkills;		
	}
	
	void display() {
		
		super.display();
		
		StringBuilder contents = new StringBuilder();
		
		contents.append("Networking Skills ->").append(networkingSkills).append(" , ");
		contents.append("Device Drivers Skill ->").append(deviceDriversSkills).append(", ");
		contents.append("Memory Management Skills ->").append(memoryManagementSkills).append(",");
		contents.append("Internet Drivers Skkill ->").append(internetDriversSkills);
		
		System.out.println(contents.toString());	
		System.out.println();
		
	}
}
