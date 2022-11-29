package mapdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {

	public static void main(String[] args) {
		

		List<Integer> numbers = new ArrayList<>();
		
		for (int index = 1; index <= 5; index ++) {
			numbers.add(index);
		}

//		demo1(numbers);
		demo2(numbers);
	}
	
	static void demo1(List<Integer> numbers) {

		List<Integer> squaredList = 
		numbers.stream()
			.map((number ) -> {
				return number * number;
			}).collect(Collectors.toList());
		
		System.out.println(numbers);
		System.out.println(squaredList);
	}

	static void demo2(List<Integer> numbers) {

		List<Employee> employeeList = 
		numbers.stream()
			.map((number ) -> {
				
				Employee emp = new Employee(number);
				return emp;
				
			}).collect(Collectors.toList());
		
		System.out.println(numbers);
		System.out.println(employeeList);
	}
	
}

class Employee {
	
	private Integer id;
	
	public Employee(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String toString() {
		return "EMP[" + id + "]";
	}
}
