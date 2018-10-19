package lesson7.model;

public class Professor extends Person {

	public Professor() {
		// TODO Auto-generated constructor stub
	}

	public Professor(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void work() {
		System.out.println("1,5FTE");

	}

	public void relax() {
		System.out.println("drink tea");
	}
}
