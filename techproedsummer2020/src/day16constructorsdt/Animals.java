package day16constructorsdt;

public class Animals {
	int height = 50;
	String name = "Rabbit";
	boolean mammal = true;

	Animals(){}

	Animals(int height, String name, boolean mammal) {
		this.height = height;
		this.mammal = mammal;
		this.name = name;
	}

	public static void main(String[] args) {

		Animals a1 = new Animals();
		Animals a2 = new Animals(100, "cat", true);

		System.out.println(a1.height + " " + a1.name + " " + a1.mammal);
		System.out.println(a2.height + " " + a2.name + " " + a2.mammal);
	}

}
