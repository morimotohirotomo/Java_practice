package sukkiri;

public class Main {
	public static void main(String[] args) {
		Hero h = new Hero("ミナト");
		PoisonMatango pm = new PoisonMatango('A');
		pm.attack(h);
	}
}
