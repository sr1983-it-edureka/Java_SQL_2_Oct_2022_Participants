package thread.sleep;

public class Main {

	public static void main(String[] args) {
		
		// Thread 1
		NumberPrinterThread npt1 
			= new NumberPrinterThread("NP Thread 1");
		
		Thread t1 = new Thread(npt1);
		t1.start();	
		
		//  Thread 2		
		NumberPrinterThread npt2 = 
			new NumberPrinterThread("NP Thread 2");
		
		Thread t2 = new Thread(npt2);
		t2.start();
	}
}
