package day36interfacesiteratorsdt;

public interface Animal {

	void eat();

	/*
	 * Normally we can not create concrete methods in interfaces but if we need it
	 * too much java gives us an option to do it by using "default" keyword like in
	 * the following example.
	 */
	
	// A default method is unique to an instance of the class.
	// --> it is attached to object.
	default void drink() {
		System.out.println("woow!! concrete method in an interface!");
	}
	//A static method is unique to a class.
	// --> it is attached to class
	static void run() {
		System.out.println("woow! second way to create concrete method in an interface!");
	}
	
	/*
	 * and concrete methods in interfaces are not mandatory to override for childs.
	 */

}
