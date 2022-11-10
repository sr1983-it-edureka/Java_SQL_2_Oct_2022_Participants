package arraysum;

public class ArrayTotalSum_Ram {

	int []array;
	int totalCount = 0;
	
	public ArrayTotalSum_Ram(int array[]) {
		this.array = array;
	}
	
	void calculateTotalSum() {
		
		
		for (int index = 0; index < array.length; index ++) {
			
			int number = array[index];
			totalCount = totalCount + number;
		}
				
	}
	
	int returnTotalCount() {
		return totalCount;
	}
}
