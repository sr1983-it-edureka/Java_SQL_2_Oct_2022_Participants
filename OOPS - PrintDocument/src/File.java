
public class File {

	// Property of an object
	int x;
	
	// C: D:
	char driveLetter;	
	
	String name;
	int noOfPages;
	
	boolean readOnly;
	// false

	// Provide default/inital values to properties
	File(){
		
//		x = 1000;
			
		driveLetter = 'C';
		readOnly = false;
	}	
	
	File (String tName, int tNoOfPages, char tDriveLetter,
		boolean tReadOnly){
		
		this(tName, tNoOfPages);		
		driveLetter = tDriveLetter;
		readOnly = tReadOnly;
	}

	File (String tName, int tNoOfPages){
			
		this();
		name = tName;
		noOfPages = tNoOfPages;		
	}

	void display() {
		
		System.out.println(x);
		System.out.println("Name ->" + name);
		System.out.println("No of pages ->" + noOfPages);
		System.out.println("Drive Letter ->" + driveLetter);
		System.out.println("Read only ->" + readOnly);
		
		System.out.println();
	}
	
	void testMethod(int x) {
		
		// Function local X / Method local X
		
		System.out.println("Value of x (local X) is ->" + x);
		System.out.println("Value of x (Property x) is ->" + this.x);
	}
}
