
public class MethodOverridingDemo {

	public static void main(String[] args) {
		
		IDE ide = new IDE();
		ide.launch();
		
		Eclipse eclipse = new Eclipse();
		eclipse.launch();
	}
}

class IDE {
	
	void launch() {
		
		System.out.println("IDE is launching");
	}
}

class Eclipse extends IDE {
	
	@Override
	void launch() {
		System.out.println("IDE is launching - Checking for workspaces, loading all projects...");
	}
}