package defaultt.interfaces.demo3;

public interface ChangeOwnership {

	
	default void appointAssistant() {
		
		System.out.println("Hire a person");
	}
	
	void changeOnwership();
}
