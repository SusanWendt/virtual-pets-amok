package virtualpetsamok;

public class RoboDog extends RoboticPet implements Walkable {
	
	private int needToWalk;

	public RoboDog(String name, String description, int rust, int needToWalk) {
		super(name, description, rust);
		this.needToWalk = needToWalk;
	}

	@Override
	public String toString() {
		return "name: " + name + "| description: " + description + "| rust: " + rust + "| need to walk: " + needToWalk
				+ "| health: " + health() + "| happiness: " + happiness();
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
