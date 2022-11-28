package com.edureka.javasql2.arrays;

public class Array2DDemo {

	public static void main(String[] args) {
		
		int studentMarks[] = 
				{40, 80, 90, 76, 54};
				
		System.out.println(studentMarks[1]);
		
		int[][] studentsMarks = 
			{
					{40,	80, 90,	60,	70},
					{90,	70,	88,	44,	80},
					{100,	60,	78,	90,	90}
			};
		
		int element = studentsMarks[1][3];
		System.out.println("Element value is"+ element);
	}
}
