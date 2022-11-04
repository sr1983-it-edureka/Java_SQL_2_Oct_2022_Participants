
public class SystemProgrammerDemo {

	public static void main(String[] args) {
		
		// Networking, DeviceDrivers, MemoryManagement
		// Internet Drivers
		
		String[] certificationsVivek = {
			"System Programming Level 1",
			"Advanced System Programming - Level 5"};
		
		SystemProgrammer vivek = new SystemProgrammer
			("Vivek", "C", true, false, true, false, certificationsVivek);
		vivek.display();
		
		SystemProgrammer harini = new SystemProgrammer
			("Harini", "C++", false, true, true, true,
				new String[] {"System Programming - Level 1"});
		harini.display();
				
		
	}
}
