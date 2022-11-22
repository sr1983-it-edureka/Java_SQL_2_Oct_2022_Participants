package demo4.impl;

import demo3.Flyable;

public class Eagle implements Flyable{

	@Override
	public void fly() {
		
		System.out.println("I have wings and I can fly...");		
	}

}
