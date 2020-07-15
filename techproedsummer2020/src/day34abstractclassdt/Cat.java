package day34abstractclassdt;

public class Cat extends Animal {

	/*
	 * if the child is concrete it is must to override abstract methods. but if the
	 * child class is abstract overriding abstract methods is optional.
	 */

	public static void main(String[] args) {
	}

	@Override
	public void drink() {
		System.out.println("Cats drink water and milk");
	}

	@Override
	public void eat() {
		System.out.println("Cats eat cheese");

	}

	@Override
	public void sound() {
		System.out.println("Cats meaw");

	}

}
