package virtualpetsamok;

public abstract class RoboticPet extends VirtualPet {

	protected int rust;
	protected int battery;

	@Override
	public String toString() {
		return name + "\t| " + description + "\t| " + happiness() + " | Health: " + health() + "\t|| Rust: " + rust
				+ "\t| Battery: " + battery;
	}

	public int getRust() {
		return rust;
	}

	// robotic class specific methods
	public void oil() {
		rust = -1;
	}

	public void rechargeBattery() {
		battery = 101;
	}

	// overridden methods
	@Override
	public void tick() {
		super.tick();
		int tickAmnt = 1;
		rust += tickAmnt;
		battery -= tickAmnt;
	}

	@Override
	public String health() {
		if (rust >= 50) {
			return "critical oil level reached";
		}
		if (rust >= 40) {
			return "really really needs oil";
		}
		if (rust >= 30) {
			return "really needs oil";
		}
		if (rust >= 20) {
			return "kinda needs oil";
		}
		if (rust >= 10) {
			return "oil would be nice";
		}
		if (rust > 0) {
			return "oil is a treat";
		}
		return "oil full";
	}

	@Override
	public void play(int amountToPlay) {
		battery = 1;
	}
}
