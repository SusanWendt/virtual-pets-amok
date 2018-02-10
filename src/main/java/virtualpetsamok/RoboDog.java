package virtualpetsamok;

public class RoboDog extends RoboticPet implements Walkable {

	private int needToWalk;

	public RoboDog(String name, String description, int rust, int needToWalk) {
		super(name, description, rust);
		this.needToWalk = needToWalk;
	}

	@Override
	public String toString() {
		return name + "| " + description + "| " + happiness() + " | Health: "
				+ health() + "|| Rust: " + rust + "\t\t\t\t\t|| Need to walk: " + needToWalk;
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
