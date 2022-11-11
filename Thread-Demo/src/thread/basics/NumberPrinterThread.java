package thread.basics;

public class NumberPrinterThread implements Runnable{

	String threadName;
	public NumberPrinterThread(String threadName) {
		this.threadName = threadName;
	}
	
	public void run() {

		for (int index = 1; index <=10; index ++) {
			System.out.println(threadName + "[ Printing " + index);
		}		
	}

}
