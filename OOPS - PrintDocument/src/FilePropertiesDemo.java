
public class FilePropertiesDemo {

	public static void main(String[] args) {
		
		// Makes use of driveLetter property
		File javaFile = new File();
		javaFile.name = "Java in 30 days";
		javaFile.noOfPages = 100;
		javaFile.driveLetter = 'D';
		javaFile.display();
		javaFile.testMethod(2000);
		
		File harryPotterPDFFile = new File();
		harryPotterPDFFile.name = "Harry Potter - Part 5";
		harryPotterPDFFile.noOfPages = 751;
		harryPotterPDFFile.readOnly = true;
		harryPotterPDFFile.display();
		
		File timeManagementFile = new File(
			"Balance your personal life and work life", 
			400, 'F', true);
		timeManagementFile.display();
		
		File interstellarMovieScriptFile = 
				new File("Interstellar - Draft Script - v 10", 440);
		interstellarMovieScriptFile.display();
		// Inter 
		// 440
		// C
		// false
		
	}
}
