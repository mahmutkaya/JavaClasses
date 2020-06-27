package day_04;

public class WarmUp {

	public static void main(String[] args) {
		//Print even numbers between 1-20 inclusive e.g.2 4 6 .. 20
		for(int i=0; i<=20;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		for(int j=0;j<=10;j++) {
			System.out.print(2*j+" ");
		}
		System.out.println();
		
		//Print odd numbers between 1-20 inclusive.e.g 1,3,5,7,...,19   Including comma
		int k =0;
		while(k<=20) {
			if(k%2!=0) {
				if(k<19) {
					System.out.print(k+",");
				}else {
					System.out.println(k);
				}
				
			}
			k++;
		}
		
		//Print all number that is divisible by 5 backward from 20-1 inclusive e.g.20,15,10,..
		int l=20;
		do {
			if(l%5==0) {
				if(l>5) {
					System.out.print(l+",");
				}else {
					System.out.println(l);
				}
			}
			l--;
		}while(l>=5);
		
		//Find the sum of all even numbers form 1 - 20 inclusive
		int sum =0,m=0;
		while(m<=20) {
			if(m%2==0) {
				sum+=m;
			}
			m++;
		}
		System.out.println(sum);
		//Print all numbers from 1-20 except 11 or 15
		int num=0;
		while(num<=20) {
			if(num!=11 && num!=15) {
				System.out.print(num+" ");
			}
			num++;
		}
		System.out.println();
		for(int i=0;i<=20;i++) {
			if(i==11||i==15) {
				continue;
			}else {
				System.out.print(i+" ");
			}
		}
		
	}

}
