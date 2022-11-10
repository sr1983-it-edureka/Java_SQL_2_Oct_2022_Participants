package arraysum2;

public class TeacherMain {

	public static void main(String[] args) {
		
		int[] array = {10, 20, 30, 40};
		
		ArrayTotalSum_Ram ramVersion = new ArrayTotalSum_Ram();
		int count = ramVersion.calculate(array);
		System.out.println("Count is " + count);
		
		SwetaArraySumCalculator swetaVersion = new SwetaArraySumCalculator();
		swetaVersion.calculate(array);
		System.out.println("Count is " + count);
	}
}
