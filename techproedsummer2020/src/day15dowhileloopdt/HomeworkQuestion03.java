package day15dowhileloopdt;

public class HomeworkQuestion03 {

	public static void main(String[] args) {
		/*
		 * Write a program to print numbers which are divisible by 5 between 1 and 100
		 * on the console by using do-while loop
		 */
		int i =1;
		do {
			if(i%5==0) {
				System.out.print(i+" ");
			}
			i++;
		}while(i<100);
	}

}
