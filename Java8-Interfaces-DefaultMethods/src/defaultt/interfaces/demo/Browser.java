package defaultt.interfaces.demo;

public interface Browser {

	default void launch() {
		System.out.println("Luanching...");
	}
	
	default void close() {
		System.out.println("Closing...");
	}
	
	void openTab();
	
	void closeTab();
}
