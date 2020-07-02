package day24varargsaccessmodifiersstringbuilderdt;

public class Varargs01 {

	public static void main(String[] args) {
		add(1,2,3,4);
		System.out.println(joinChars('a','l','i'));

	}
	public static void add(int... args) {
		for(int w:args) {
			System.out.println(w);
		}
				
	}
	public static String joinChars(char... args) {
		String str = "";
		for(char w:args) {
			str+= w;
		}
		return str;		
	}

}
