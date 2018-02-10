package virtualpetsamok;

public abstract class VirtualPet {

	// protected String status for abstract class;
	protected String name;
	protected String description;

	// constructor 2
	public VirtualPet(String name, String description) {
		this.name = name;
		this.description = description;
	}

	// getter for constructor2: name and description
	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	protected abstract String health();

	public String happiness() {
		if (health().equals("Dead") || health().equals("Bad") || health().equals("Okay")) {
			return "Unhappy \t";
		}
		if (health().equals("critical oil level reached") || health().equals("really really needs oil") || (health().equals("really needs oil"))) {
			return "Unhappy \t";
		}
		return "Happy \t";
	}

	public abstract void tick();
}
