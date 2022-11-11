package thread.sleep;

public class NumberPrinterThread implements Runnable{

	String threadName;
	public NumberPrinterThread(String threadName) {
		this.threadName = threadName;
	}
	
	public void run() {

		for (int index = 1; index <=10; index ++) {
			System.out.println(threadName + "[ Printing " + index);
			
			int seconds = 4;
			
			if (threadName.equals("NP Thread 1")) {
				
				try {
					
					Thread.sleep(seconds * 1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}				
			}			

		}		
	}

}
