package interfaces.demo;

public class Firefox implements Browser{

	@Override
	public void launch() {
		
		System.out.println("Luanching...");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void close() {
		System.out.println("Closing...");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void openTab() {
		System.out.println("Opening firefox tab");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void closeTab() {
		
		System.out.println("Closing firefox tab");
		// TODO Auto-generated method stub
		
	}

}
