package sortdemo;

import java.util.ArrayList;
import java.util.Collections;

public class SortDemo {

	public static void main(String[] args) {
		
//		numbersSort();
		employeesSort();
	}
	
	static void numbersSort() {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(1);numbers.add(1);numbers.add(31);numbers.add(91);
		numbers.add(111);numbers.add(11);numbers.add(41);numbers.add(15);
		
		System.out.println("Before Sorting -> " + numbers);
		Collections.sort(numbers);
		System.out.println("After sorting ->" + numbers);
	}
	
	static void employeesSort() {
		
		Employee e1 = new Employee("Anusha", "678");
		Employee e2 = new Employee("Raj", "789");
		Employee e3 = new Employee("Kishore", "123");
		Employee e4 = new Employee("Hugh", "345");
		
		ArrayList<Employee> list = new ArrayList<>();
		list.add(e1);		list.add(e2);		list.add(e3);
		list.add(e4);

		System.out.println("Before sorting " + list);
		Collections.sort(list);
		System.out.println("After sorting " + list);
	}
}
