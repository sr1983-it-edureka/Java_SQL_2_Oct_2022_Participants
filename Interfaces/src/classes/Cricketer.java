package classes;
import interfaces.Playable;

public class Cricketer implements Playable {

	@Override
	public void play() {
		
		System.out.println("I can hit six.");
		System.out.println("I can take all the wickets");
	}

	
}
