package lesson7.model;

public class Student extends Person {

	@Override
	public void work() {
		System.out.println("0,5FTE");
	}

	public void relax() {
		System.out.println("Sleep Zzzz...");
	}

	public void playCompGames() {
		System.out.println("Heroes of MM, wog");
	}
}
