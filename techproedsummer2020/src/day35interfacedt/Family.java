package day35interfacedt;

public class Family extends Hotel{

	@Override
	public void breakfast() {
		System.out.println("breakfast");
	}
	@Override
	public void roomCleaning() {
		System.out.println("room cleaning");
	}

}
