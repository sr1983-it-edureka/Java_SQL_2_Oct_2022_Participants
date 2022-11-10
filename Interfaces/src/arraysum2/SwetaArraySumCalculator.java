package arraysum2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class SwetaArraySumCalculator implements ArrayTotalCounter{

	public int calculate(int[] array) {
		
		ArrayList<Integer> arrayList = convert(array);
		
		int totalValue = 0;
		Iterator<Integer> iterator 
		= arrayList.iterator();
		
		while (iterator.hasNext()) {
			
			totalValue += iterator.next();
		}
		
		return totalValue;		
	}
	
	ArrayList<Integer> convert(int [] array){
	
		ArrayList<Integer> list = new ArrayList<>();
		for (int index = 0; index < array.length; index ++) {
			
			list.add(array[index]);
		}
		
		return list;
	}
	

}
