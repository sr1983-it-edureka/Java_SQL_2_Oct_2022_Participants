package filterdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterDemo {

	public static void main(String[] args) {
				
		List<Integer> numbers = new ArrayList<>();
		
		for (int index = 1; index <= 10; index ++) {
			numbers.add(index);
		}
		
//		demo1(numbers);
//		demo2(numbers);
//		demo3(numbers);
//		demo4(numbers);
//		demo5(numbers);
//		demo6(numbers);
		demo7(numbers);
	}
	
	static void demo1(List<Integer> numbers) {
		
		EvenNumberFilter evenFilter = new EvenNumberFilter();
		
		List<Integer> evenNumbers = numbers.stream().filter(
			evenFilter).collect(
				Collectors.toList());
		
		System.out.println(numbers);
		System.out.println(evenNumbers);
	}


	static void demo2(List<Integer> numbers) {
				
		List<Integer> oddNumbers = 
			numbers.stream().filter(
					
				new Predicate<Integer>() {
					
					public boolean test(Integer t) {
						
						if ( t%2 != 0) {
							return true;
						}else {
							return false;
						}
					}
				}).collect(Collectors.toList());
		
		System.out.println(numbers);
		System.out.println(oddNumbers);
	}

	
	static void demo3(List<Integer> numbers) {
		
		Predicate<Integer> oddNumberFilter
			= new Predicate<Integer>() {
				
				public boolean test(Integer t) {
					
					if ( t%2 != 0) {
						return true;
					}else {
						return false;
					}
				}
			};
		
		List<Integer> oddNumbers = 
			numbers.stream().filter(oddNumberFilter).collect(
					Collectors.toList());
		
		System.out.println(numbers);
		System.out.println(oddNumbers);
	}	

	static void demo4(List<Integer> numbers) {
		
		Predicate<Integer> oddNumberFilter
			= (Integer t) -> {
					
					if ( t%2 != 0) {
						return true;
					}else {
						return false;
					}
				};
				
		List<Integer> oddNumbers = 
			numbers.stream().filter(oddNumberFilter).collect(
					Collectors.toList());
		
		System.out.println(numbers);
		System.out.println(oddNumbers);
	}	

	
	
	static void demo5(List<Integer> numbers) {
		
		Predicate<Integer> oddNumberFilter
			= (Integer t) -> {
					
					return ( t%2 != 0);
				};
				
		List<Integer> oddNumbers = 
			numbers.stream().filter(oddNumberFilter).collect(
					Collectors.toList());
		
		System.out.println(numbers);
		System.out.println(oddNumbers);
	}		


	static void demo6(List<Integer> numbers) {
		
		Predicate<Integer> oddNumberFilter
			= (Integer t) -> ( t%2 != 0);
				
		List<Integer> oddNumbers = 
			numbers.stream().filter(oddNumberFilter).collect(
					Collectors.toList());
		
		System.out.println(numbers);
		System.out.println(oddNumbers);
	}		

	static void demo7(List<Integer> numbers) {
		
		Predicate<Integer> oddNumberFilter
			= (t) -> ( t%2 != 0);
				
		List<Integer> oddNumbers = 
			numbers.stream().filter(oddNumberFilter).collect(
					Collectors.toList());
		
		System.out.println(numbers);
		System.out.println(oddNumbers);
	}		

	static void demo8(List<Integer> numbers) {
					
		List<Integer> oddNumbers = 
			numbers
			.stream()
			.filter((t) -> ( t%2 != 0))
			.collect(Collectors.toList());
		
		System.out.println(numbers);
		System.out.println(oddNumbers);
	}		
	
}


class EvenNumberFilter implements Predicate<Integer>{

	@Override
	public boolean test(Integer t) {
		
		if (t %2 == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	
}
