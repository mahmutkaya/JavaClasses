package day35interfacedt;

public interface Gas extends Engine {
	/*
	 * 1)interface ==> interface use "extends" 2)class (abstract or concrete) ==>
	 * interface use "implements" 3)class ==> class use "extends" 4)interface ==>
	 * class: It is not valid. Because parent of an interface must be interface
	 */

	int price = 1;

	void eco();
}
