
public class ApplicationProgrammerDemo {

	public static void main(String[] args) {
			
		ApplicationProgrammer raghu = new ApplicationProgrammer("Raghu", "Java", 
			new String[] {"Java 11 Certififcation", "PHP Certification"});		
		raghu.display();
		
		ApplicationProgrammer sweta = new ApplicationProgrammer("Sweta", "Node JS",
			new String[] {"Node JS Certification", 
				"Java FSD Cerfification", "AWS Certification",
				"AWS DevOps Certification"});
		sweta.display();
		
	}
}
