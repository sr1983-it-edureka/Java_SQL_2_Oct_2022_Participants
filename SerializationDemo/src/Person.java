import java.io.Serializable;

public class Person implements Serializable {

	String name;
	int age;
	String address;
	transient String password;
	
	public Person(String name, int age, 
		String address, String password) {
		
		this.name = name;
		this.age = age;
		this.address = address;
		this.password = password;
	}
	
	public void display() {
		
		System.out.println(String.format("Name is %s, Age us %d and "
				+ "Address is %s and Password is %s", 
				name, age, address, password));
	}
}
