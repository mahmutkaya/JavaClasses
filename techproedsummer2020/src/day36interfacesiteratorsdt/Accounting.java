package day36interfacesiteratorsdt;

public class Accounting implements Employee{
	
	int kids;
	String edu;

	public static void main(String[] args) {
	}
	
	@Override
	public double salary() {
		return 5;
	}
	
	@Override
	public void personalInfo() {
		kids = 1;
		edu = "BD";
	}

	@Override
	public void task() {
		// TODO Auto-generated method stub
		
	}

}
