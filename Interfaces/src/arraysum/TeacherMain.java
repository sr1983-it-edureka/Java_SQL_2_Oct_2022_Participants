package arraysum;

import java.util.ArrayList;

public class TeacherMain {

	public static void main(String[] args) {
		
		ramVersion();
	}
	
	static void ramVersion() {
		int[] array = {43, 32309, 3232, 21121};
		ArrayTotalSum_Ram ram = new ArrayTotalSum_Ram(array);
		
		ram.calculateTotalSum();
		int count =	ram.returnTotalCount();
		System.out.println("Count is " + count);
	}
	
	static void swetaVersion() {
		
		SwetaArraySumCalculator sweta = new SwetaArraySumCalculator();
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(3232);
		list.add(32);
		list.add(93232);
		list.add(31232);
		list.add(8732);
		
		
		int count = sweta.calculate(list);
		System.out.println("Count is " + count);
	}
}
