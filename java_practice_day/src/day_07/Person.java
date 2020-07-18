package day_07;

public abstract class Person {
	
	/*
	 * what is abstraction?:Hiding the details and implementation. It is blueprint/base
	 * 1. We can't create class object
	 * 2. Abstract class may have concrete methods
	 * 3. One class can only extends one abastract class
	 * 4. Abstract child classes doesn't have to override/implement abstract parent methods
	 */

    //Person(abstract)  > Employee(abstract) >  FTE(concrete), 
	//                                        Contractor(concrete)

	public abstract void eat();
	public abstract void drink();
	public void speak() {
		System.out.println("I can speak");
	}

}
