package day_07;

public class Contractor extends Employee {
	@Override
	public void test() {
		System.out.println("Coming from Employee");

	}

	@Override
	public void eat() {
		System.out.println("Eating Veggy");

	}

	@Override
	public void drink() {
		System.out.println("No fee drink");

	}

}
