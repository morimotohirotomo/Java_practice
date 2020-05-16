package sukkiri;

public class Main {
	public static void main(String[] args) {
		Hero h = new Hero("ミナト");
		System.out.println(h.name + h.hp);
		Hero h2 = new Hero();
		System.out.println(h2.name + h2.hp);
	}
}
