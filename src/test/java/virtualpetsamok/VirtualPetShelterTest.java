package virtualpetsamok;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Assert;
import org.junit.Test;

public class VirtualPetShelterTest {

	@Test
	public void shouldInitiateVirtualPetShelter() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		assertNotNull(underTest);
	}

	@Test
	public void ShouldAddPet() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		VirtualPet pet = new Dog("Lassie", "description", 0, 0, 0, 0, 0, 0);
		underTest.addPet(pet);
		int check = underTest.showPetsSize();
		Assert.assertSame(1, check);
	}

	@Test
	public void shouldGetPetByName() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		VirtualPet pet = new Dog("Lassie", "description");
		underTest.addPet(pet);
		VirtualPet petTested = underTest.getPetByName("Lassie");
		Assert.assertSame(pet, petTested);
	}

	@Test
	public void ShouldShowPetsSize() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		VirtualPet pet = new Dog("Lassie", "description");
		underTest.addPet(pet);
		VirtualPet pet2 = new Cat("Cat", "description");
		underTest.addPet(pet2);
		int check = underTest.showPetsSize();
		Assert.assertSame(2, check);
	}

	@Test
	public void shouldAdoptPet() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		String petName = "Lassie";
		OrganicPet pet1 = new Dog (petName, "description", 0, 0, 0, 0, 0, 0);
		underTest.addPet(pet1);
		OrganicPet pet2 = new Cat("Cat", "cat", 0, 10, 0, 0);
		underTest.addPet(pet2);
		underTest.adoptPet(petName);
		int check = underTest.showPetsSize();
		Assert.assertSame(1, check);
	}

	@Test
	public void shouldFeedAllOrganicPets() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		OrganicPet pet1 = new Dog("Lassie", "description", 10, 0, 0, 0, 0, 0);
		underTest.addPet(pet1);
		OrganicPet pet2 = new Cat("Cat", "cat", 0, 10, 0, 0);		
		underTest.addPet(pet2);
		underTest.feedAllPets();
		assertEquals(0, pet1.getHunger());
		assertEquals(0, pet2.getHunger());
	}

	@Test
	public void shouldWaterAllOrganicPets() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		OrganicPet pet1 = new Dog("dog", "dog", 0, 10, 0, 0, 0, 0);
		underTest.addPet(pet1);
		OrganicPet pet2 = new Cat("Cat", "cat", 0, 10, 0, 0);
		underTest.addPet(pet2);
		underTest.waterAllPets();
		assertEquals(0, pet1.getThirst());
		assertEquals(0, pet2.getThirst());
	}

	@Test
	public void shouldLetOutAllOrganicPets() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		OrganicPet pet1 = new Dog("Dog", "dog");
		underTest.addPet(pet1);
		OrganicPet pet2 = new Cat("Cat", "cat");
		underTest.addPet(pet2);
		underTest.letOutAllPets();
		assertEquals(0, pet1.getBathroom());
		assertEquals(0, pet2.getBathroom());
	}

	@Test
	public void shouldPlayWithAllOrganicPets() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		OrganicPet pet1 = new Dog("Dog", "dog", 0, 0, 0, 10, 0, 0);
		underTest.addPet(pet1);
		OrganicPet pet2 = new Cat("Cat", "cat", 0, 0, 0, 10);
		underTest.addPet(pet2);
		underTest.playWithAllPets();
		assertEquals(0, pet1.getEnergy());
		assertEquals(0, pet2.getEnergy());
	}

	@Test
	public void shouldTickAllPets() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		OrganicPet pet1 = new Dog("dog", "dog");
		underTest.addPet(pet1);
		OrganicPet pet2 = new Cat("cat", "cat");
		underTest.addPet(pet2);
		underTest.tickAllPets();
		assertEquals(11, pet1.getThirst());
		assertEquals(11, pet2.getThirst());
	}

	@Test
	public void shouldPlayWithOnePet() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		OrganicPet pet1 = new Dog("Dog", "dog");
		underTest.addPet(pet1);
		OrganicPet pet2 = new Cat("Cat", "cat");
		underTest.addPet(pet2);
		underTest.playWithPetByName("Dog");
		assertEquals(0, pet1.getEnergy());
		assertEquals(10, pet2.getEnergy());
	}

}
