public class Laptop {
	
	String name;
	float price;
	
	Laptop(String name, float price){
		this.name = name;
		this.price = price;
	}
	
	void display() {
		System.out.println("Display called for " + name);
	}
	
	public String toString() {
		
		return "{" + name + ", " + price + "}";
	}
}