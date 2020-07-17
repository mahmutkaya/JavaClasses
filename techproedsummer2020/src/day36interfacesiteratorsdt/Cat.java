package day36interfacesiteratorsdt;

public class Cat implements Animal, Mammal, Carnivorous {

	public static void main(String[] args) {
		Cat obj = new Cat();
		obj.drink();
		Animal.run();

	}

	// to have methods with same signature but different return types in parents
	// also will give CTE
//	@Override
//	public void eat() {
//		
//	}
//	@Override
//	public boolean eat() {
//		
//	}
//	@Override
//	public String eat() {
//		
//	}
	
	@Override
	public void eat() {
		System.out.println("saasa");
	}

}
