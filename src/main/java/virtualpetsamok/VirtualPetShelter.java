package virtualpetsamok;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class VirtualPetShelter {

	private Map<String, VirtualPet> pets = new HashMap<>();

	public void addPet(VirtualPet pet) {
		pets.put(pet.getName(), pet);
	}

	public VirtualPet getPetByName(String name) {
		return pets.get(name);
	}

	public Collection<VirtualPet> pets() {
		return pets.values();
	}

	public void showPets() { // TODO fix to create public collection VirtualPet then return pets
		for (Entry<String, VirtualPet> entry : pets.entrySet()) {
			System.out.println(entry.getValue());
		}
	}

	public int showPetsSize() {
		return pets.size();
	}

	public void adoptPet(String name) {
		pets.remove(name);
	}

	public void feedAllPets() {
		for (VirtualPet pet : pets()) {
			((OrganicPet) pet).feed(10);
		}
	}

	public void waterAllPets() {
		for (VirtualPet pet : pets()) {
			((OrganicPet) pet).water(10);
			((OrganicPet) pet).letOut(-5);
		}
	}

	public void tickAllPets() {
		for (VirtualPet pet : pets()) {
			pet.tick();
		}
	}

	public void playWithPetByName(String name) {
		VirtualPet playWithPet = getPetByName(name);
		((OrganicPet) playWithPet).play(15);
	}

	public void letOutAllPets() {
		for (VirtualPet pet : pets()) {
			if (pet instanceof OrganicPet) {
				((OrganicPet) pet).letOut(10);
				if (pet instanceof Cat) {
					((Cat) pet).incrLitterLevel(10);
				}
			}
		}
	}

	public void playWithAllPets() {
		for (VirtualPet pet : pets()) {
			if (pet instanceof OrganicPet) {
				((OrganicPet) pet).play(10);
			}
		}
	}

	public void walkAllDogs() {
		for (VirtualPet pet : pets()) {
			if (pet instanceof Walkable) {
				((Walkable) pet).walk(10);
			}
		}
	}

	public void oilAllRoboticPets() {
		for (VirtualPet pet : pets()) {
			if (pet instanceof RoboticPet) {
				((RoboticPet) pet).oil(10);
			}
		}
	}

	public void cleanCatLitterBox(int i) {
		for (VirtualPet pet : pets()) {
			if (pet instanceof Cat) {
				((Cat) pet).cleanCatLitterBox(10);
			}
		}
	}
}
