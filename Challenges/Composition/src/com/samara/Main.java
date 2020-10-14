package com.samara;

public class Main {

	public static void main(String[] args) {
		Dimensions dimensions = new Dimensions(20, 20, 5);
		Case theCase = new Case("220B", "Dell", "240", dimensions);

		com.samara.Monitor theMonitor = new com.samara.Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));

		Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

		PC thePC = new PC(theCase, theMonitor, theMotherboard);
		thePC.powerUp();


		// Create a single room of a house using composition.
		// Think about the things that should be included in the room.
		// Maybe physical parts of the house but furniture as well
		// Add at least one method to access an object via a getter and
		// then that objects public method as you saw in the previous video
		// then add at least one method to hide the object e.g. not using a getter
		// but to access the object used in composition within the main class
		// like you saw in this video.

		com.samara.Wall wall1 = new com.samara.Wall("West");
		com.samara.Wall wall2 = new com.samara.Wall("East");
		com.samara.Wall wall3 = new com.samara.Wall("South");
		com.samara.Wall wall4 = new com.samara.Wall("North");

		com.samara.Ceiling ceiling = new com.samara.Ceiling(12, 55);

		Bed bed = new Bed("Modern", 4, 3, 2, 1);

		com.samara.Lamp lamp = new com.samara.Lamp("Classic", false, 75);

		com.samara.Bedroom bedRoom = new com.samara.Bedroom("Tims", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
		bedRoom.makeBed();

		bedRoom.getLamp().turnOn();
	}
}
