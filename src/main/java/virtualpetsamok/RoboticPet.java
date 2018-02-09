package virtualpetsamok;

public class RoboticPet extends VirtualPet {
	// instance data
	private int rust;

	// new constructor
	public RoboticPet(String name, String description, int rust) {
		super(name, description);
		this.rust = rust;
	}
	
	// accessor aka getters for constructor 1
	public int getRust() {
		return rust;
	}
	
	// robotic class specific methods
	public void oil(int amountToOil) {
		rust -= amountToOil; 
	}
	
	//overridden methods 
	@Override
	public void tick() {
		// TODO Auto-generated method stub		
	}

	@Override
	public String getStatus() {
		return health;
	}

}
