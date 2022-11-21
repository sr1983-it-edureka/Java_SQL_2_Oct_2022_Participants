package com.edureka.javasql2.hibernate;

import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		for (int index = 1; index <= 10; index ++) {
		
			int randomNo = random.nextInt(5);
			System.out.println(randomNo);
		}
	}
}
