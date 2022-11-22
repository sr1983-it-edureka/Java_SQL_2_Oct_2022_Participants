package demo4.impl;

import demo3.Flyable;
import demo4.interrface.HumanBeing;

public class HumanBeingImpl implements HumanBeing, Flyable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fly() {
		
		System.out.println("I take the helicopter and fly");		
	}

}
