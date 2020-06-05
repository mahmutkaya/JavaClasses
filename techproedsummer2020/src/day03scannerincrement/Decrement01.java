package day03scannerincrement;

public class Decrement01 {

	public static void main(String[] args) {
		//decrease the value of a variable
		int num = 10;
		//1st way:
		num = num-3;
		System.out.println(num);//7
		//2nd way:
		num -= 2;
		System.out.println(num);//5
		//3rd way: to decrease by 1
		num--;
		System.out.println(num);//4
		
		int num1 = 12;
		System.out.println(num1);
		//to increase we can use multiplication as well
		//1st way:
		num1 = num1*2;
		System.out.println(num1); //24
		//2nd way:
		num1*=3;
		System.out.println(num1); //72
		
		//to decrease we can use division as well
		//1st way:
		num1 = num1/6;
		System.out.println(num1); //12
		//2nd way:
		num1/=2;
		System.out.println(num1); //6
	}

}
