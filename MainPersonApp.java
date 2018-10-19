package lesson7.model;

public class MainPersonApp {

	public static void main(String[] args) {
		Student student = new Student();
		student.relax();	
		student.work();

		Professor professor = new Professor();
		professor.relax();
		professor.work();

		Assistant assistant = new Assistant();
		assistant.relax();
		assistant.work();

		
		Person[] world = new Person[5];
		
		world[0] = new Student();
		world[1] = new Assistant();
		world[2] = new Professor();
		world[3] = new Student();
		world[4] = new Assistant();
		
		System.out.println("=======");
		
		for(Person p:world) {
			p.relax();
			p.work();
		}
		
	}

}
