package day03scannerincrement;

public class TypeCasting01 {

	public static void main(String[] args) {
		// primitives about numbers: byte < short < int < long < float < double
		// First type of casting is auto widening: convert smaller data type to a bigger
		// one.

		byte num1 = 112;
		short num2 = num1;

		int num3 = 2345;
		double num4 = num3;

		// explicit narrowing: convert a data type to a smaller one.
		long num5 = 657;
		short num6 = (short) num5;

		double num7 = 12.33;
		float num8 = (float) num7;

		short num9 = 520;
		byte num10 = (byte) num9;

		System.out.println(num10);

	}

}
