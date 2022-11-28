package com.edureka.javasql2.arrays;

public class Array2DDemo2 {

	public static void main(String[] args) {
		
		String[][] employees = 
			{
					{"Java SCJP 11", "AWS Certification"},
					{"Java SCJP 17", "Python Certification", 
							"Scrum Master Certification"},
					{"AWS DevOps Certification"}
			};

		System.out.println("Length of array ->" + employees.length);
		
		int arrayLength = employees.length;
		for (int rowIndex = 0; rowIndex  < arrayLength; rowIndex ++) {
			
			int rowArrayLength  = employees[rowIndex].length;
			
			for (int index = 0; index < rowArrayLength; index ++) {
				
				String value = employees[rowIndex][index];
				
				System.out.print(value + " ");				
			}
			System.out.println();
		}
		
	}
}
