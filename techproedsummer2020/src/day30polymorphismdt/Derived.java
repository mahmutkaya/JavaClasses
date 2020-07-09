package day30polymorphismdt;

public class Derived {
	public Integer getDetails(String temp){
		return 1;
	}

}

class Tes extends Derived{
	public Integer getDetails(String temp) {
		System.out.println("Test class "+ temp);
		return 0;
	}
}
