package arraysum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SwetaArraySumCalculator {

	int calculate(ArrayList<Integer> arrayList) {
		
		int totalValue = 0;
		Iterator<Integer> iterator 
		= arrayList.iterator();
		
		while (iterator.hasNext()) {
			
			totalValue += iterator.next();
		}
		
		return totalValue;
	}
}
