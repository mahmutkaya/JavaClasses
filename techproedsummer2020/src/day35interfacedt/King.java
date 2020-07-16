package day35interfacedt;

public class King extends Hotel{
	
	public void tea() {
		System.out.println("tea service for kings..");
	}
	
	@Override
	public void breakfast() {
		System.out.println("breakfast");
	}
	@Override
	public void roomCleaning() {
		System.out.println("room cleaning");
	}

}
