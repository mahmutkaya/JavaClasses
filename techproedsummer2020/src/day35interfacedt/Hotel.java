package day35interfacedt;

public abstract class Hotel {

	/*
	 * 1)In a hotel, breakfast and daily room cleaning are mandatory for all type of
	 * rooms with different foods. 
	 * 2)In the hotel there are "single", "family", and "King" rooms. 
	 * 3)Breakfast in the room is optional for all rooms 
	 * 4)For King room tea services are mandatory twice in a day.
	 */

	public abstract void breakfast();

	public abstract void roomCleaning();

	public void breakfastInRoom() {
		System.out.println("breakfast in room is $20.");
	}

}
