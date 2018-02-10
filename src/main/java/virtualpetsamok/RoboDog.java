package virtualpetsamok;

public class RoboDog extends RoboticPet implements Walkable {

	private int needToWalk;

	public RoboDog(String name, String description, int rust, int battery, int needToWalk) {
		super(name, description, rust, battery);
		this.needToWalk = needToWalk;
	}

	@Override
	public String toString() {
		return name + "\t\t| " + description + "\t| " + happiness() + " | Health: " + health() + "|| Rust: " + rust
				+ "| Battery: " + battery + "\t\t\t|| Need to walk: " + needToWalk;
	}

	@Override
	public int getNeedToWalk() {
		return needToWalk;
	}

	@Override
	public void walk(int amountToWalk) {
		needToWalk -= amountToWalk;
	}

}
