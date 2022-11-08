
public class Planet {

	String name;
	boolean lifeExistencePossible;
	
//	Planet(String lName, boolean lLifeExistencePossible) {
//		
//		name = lName;
//		lifeExistencePossible = lLifeExistencePossible;
//		
//		
//	}

	Planet(String name, boolean lifeExistencePossible) {
		
		this.name = name;
		this.lifeExistencePossible = lifeExistencePossible;		
	}

	void display() {
		
		System.out.println("Value of 'this' is " + this);
		System.out.println("Name is " + name);
		System.out.println("Life Existence Possible ?" + lifeExistencePossible);
		System.out.println();
	}
	
	public String toString(){
		
		StringBuilder  results = new StringBuilder();
		
		results.append("{");
		results.append(name).append(",").append(lifeExistencePossible);
		results.append("}");
		
		return results.toString();
	}
}

