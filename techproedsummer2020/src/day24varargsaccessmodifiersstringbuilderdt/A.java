package day24varargsaccessmodifiersstringbuilderdt;

public class A {

	private int x = 12;
	public int y = 13;
	int z = 14;
	static int t = 15;

	public static void main(String[] args) {
		A obj = new A();
		A obj2 = new A();
		A obj3 = new A();
		obj.x = 15;
		obj2.x = 17;
		obj3.t = 19;
		System.out.println(obj.x);
		System.out.println(obj2.x);
		System.out.println(obj3.t);
		System.out.println(t);

	}

}
