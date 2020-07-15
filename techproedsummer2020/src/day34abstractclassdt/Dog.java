package day34abstractclassdt;

public class Dog extends Animal{
	
	/*
	 * inside a concrete class you can not create abstract methods.
	 * all methods inside a concrete class must be concrete.
	 */

	@Override
	public void eat() {
		System.out.println("dogs eat meat");
		
	}

	@Override
	public void sound() {
		System.out.println("dogs bark");
		
	}

}
