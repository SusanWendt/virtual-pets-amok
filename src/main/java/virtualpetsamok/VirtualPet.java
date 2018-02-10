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

	@Override
	public String toString() {
		return "" + name + "| " + description;
	}

	protected abstract String health();

	public String happiness() {
		if (health().equals("Dead")) {
			return "unhappy";
		}
		if (health().equals("Bad")) {
			return "unhappy";
		}
		if (health().equals("Okay")) {
			return "unhappy";
		}
		if (health().equals("Content")) {
			return "happy";
		}
		if (health().equals("Good")) {
			return "happy";
		}
		if (health().equals("Great")) {
			return "happy";
		}
		return "HAPPY!";
	}

	public abstract void tick();
}
