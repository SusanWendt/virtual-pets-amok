package virtualpetsamok;

public class RoboCat extends RoboticPet {

	public RoboCat(String name, String description, int rust, int battery) {
		this.rust = rust;
		this.battery = battery;
	}

	public RoboCat(String name, String description) {
		this.name = name;
		this.description = description;
		this.rust = 15;
		this.battery = 15;
	}
}