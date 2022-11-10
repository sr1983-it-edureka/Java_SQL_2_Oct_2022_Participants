package arraysum2;

public class ArrayTotalSum_Ram implements ArrayTotalCounter {

	int totalCount = 0;
	
	public int calculate(int[] array) {
		
		for (int index = 0; index < array.length; index ++) {
			
			int number = array[index];
			totalCount = totalCount + number;
		}
		
		return totalCount;
	}

}
