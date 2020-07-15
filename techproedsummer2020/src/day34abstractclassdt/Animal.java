package day34abstractclassdt;

public abstract class Animal extends Creature{
	/*
	 * inside the abstract class you can use both abstract and concrete methods.
	 */
	public static void main(String[] args) {

	}

	public abstract void eat();

	public abstract void sound();

	public void drink() {

	}

	@Override
	public void breathe() {
		
	}

}
