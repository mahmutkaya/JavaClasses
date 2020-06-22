package day17constructorsmethodcreationdt;

public class Animal {
	int age = 7; //default value for int is 0
	String name = "Dog"; //default value for String is "" or null
	boolean mamal; //default value for boolean is false
	
	Animal(){
		this(false);
		System.out.println("no param");
	}
	Animal(boolean mamal){
		this(5,"jj");
		System.out.println("boolean");
		this.mamal = mamal;
		
	}
	Animal(int age, String name){
		System.out.println("int and string");
	}

	public static void main(String[] args) {
		Animal a1 = new Animal();

	}

}
