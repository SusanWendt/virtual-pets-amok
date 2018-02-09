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

	public abstract String health();

	public abstract void tick();
}
