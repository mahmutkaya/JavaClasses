package day_07;

public interface FlyingObjects {
	String name="Boeing 747";
	//Airplane, Helicopter, Kite, Drone, Balloon,...They can all fly
	void fly();
	//Normally all methods are abstract by default
	//if we use default or static then the method can have a body
	//After Java 8 default and static method are possible
	default void takingoff() {
	}
	static void landing() {	
	}
	/*
	 * 1.All of the methods are abstract by default(if we are not using default , static)
	 * 2.All methods are either abstract, default, static
	 * 3.Access modifiers are optional
	 * 4.Unlike abstraction, one class can implement more than one interface the same time
	 * 5.An interface can implement another interface
	 */

}
