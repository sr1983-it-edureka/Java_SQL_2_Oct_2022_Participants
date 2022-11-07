package classes;
import interfaces.Flyable;

// A is-B
// class A extends B {} class B

// Bird can fly
// Bird is-a Flyable

public class Bird implements Flyable{

	public void fly() {

		System.out.println("I can fly upto certain height...");
	}

	
}
