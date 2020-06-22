package day17constructorsmethodcreationdt;

public class MethodCreation03 {

	public static void main(String[] args) {
		add();
	}
	public static void add() {
		System.out.println("addition");
	}
	public static void add(int x) {
		System.out.println("second addition");
	}
	public static void add(double x) {
		System.out.println("third addition");
	}
	public static void add(int x, boolean b) {
		System.out.println("fourth addition");
	}
	public static void add(boolean b, int x) {
		System.out.println("fiveth addition");
	}


}
