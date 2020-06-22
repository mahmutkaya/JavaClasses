package day17constructorsmethodcreationdt;

public class MethodCreation01 {

	public static void main(String[] args) {
		add();
		subtract(5,3);
		System.out.println(multiply(7,11));
		System.out.println(devision(12,4));

	}
	public static void add() {
		System.out.println("addition");
	}
	public static void subtract(int x, int y) {
		System.out.println(x-y);
	}
	public static int multiply(int x, int y) {
		return x*y;
	}
	public static int devision(int x, int y) {
		return multiply(x,y)+x/y;
	}

}
