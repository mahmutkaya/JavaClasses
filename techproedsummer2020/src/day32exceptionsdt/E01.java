package day32exceptionsdt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E01 {
	
	/*
	 * To handle a Compile time exception you have two options
	 * 		a) you can use "throws" keyword between ")" and "{"
	 * 		b) you can use "try-catch" block. this is better to use.
	 */

	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("src/day31exceptionsdt/TextFile");
			int i = 0;
			while ((i = fis.read()) != -1) {
				System.out.print((char) i);

			}
			
			
			System.out.println(3/0);
			
		} catch (FileNotFoundException e) {
			System.out.println("The path is wrong or the file is not accessible");
		} catch (IOException e) {
			System.out.println("The file is not ok to read or close");
		} catch(ArithmeticException e) {
			System.out.println("\na number can not divide by zero");
		}finally {
			fis.close();
			System.out.println("done");
		}

	}

}
