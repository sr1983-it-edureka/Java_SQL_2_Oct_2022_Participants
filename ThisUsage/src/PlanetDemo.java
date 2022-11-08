
public class PlanetDemo {

	public static void main(String[] args) {
		
		Planet earth = new Planet("Earth", true);
		earth.display();
		
		Planet saturn = new Planet("Saturn", false);
		saturn.display();
	}
}
