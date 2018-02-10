package virtualpetsamok;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OrganicPetTest {
	@Test
	public void shouldGetHunger() {
		OrganicPet underTest = new Dog("name", "description", 1, 0, 0, 0, 0, 0);
		int hunger = underTest.getHunger();
		assertEquals(1, hunger);
	}

	@Test
	public void shouldGetThirst() {
		OrganicPet underTest = new Dog ("name", "description", 0, 1, 0, 0, 0, 0);
		int thirst = underTest.getThirst();
		assertEquals(1, thirst);
	}

	@Test
	public void shouldGetBathroom() {
		OrganicPet underTest = new Cat("name", "description", 0, 0, 1, 0, 0);
		int bathroom = underTest.getBathroom();
		assertEquals(1, bathroom);
	}

	@Test
	public void shouldGetEnergy() {
		OrganicPet underTest = new Cat("name", "description", 0, 0, 0, 1, 0);
		int energy = underTest.getEnergy();
		assertEquals(1, energy);
	}

	@Test
	public void shouldGetStatus() {
		OrganicPet underTest = new Cat("name", "description", 0, 0, 0, 0, 0);
		String status = underTest.health();
		assertEquals("Amazing", status);
	}

//	@Test
//	public void shouldShowVirtualPet() {
//		OrganicPet underTest = new OrganicPet("name", "description", 0, 0, 0, 0);
//		String asString = underTest.toString();
//		assertEquals("name: name| description: description| hunger: 0| thirst: 0| bathroom: 0| energy:0| health: Amazing", asString);
//	}
//
//	@Test
//	public void shouldDecreaseHungerBy10() {
//		OrganicPet underTest = new OrganicPet("name", "description", 10, 0, 0, 0);
//		underTest.feed(10);
//		int hunger = underTest.getHunger();
//		assertEquals(0, hunger);
//	}
//
//	@Test
//	public void shouldDecreaseThirstBy10() {
//		OrganicPet underTest = new OrganicPet("name", "description", 0, 10, 0, 0);
//		underTest.water(10);
//		int thirst = underTest.getThirst();
//		assertEquals(0, thirst);
//	}
//
//	@Test
//	public void shouldDecreaseBathroomBy10() {
//		OrganicPet underTest = new OrganicPet("name", "description", 0, 0, 10, 0);
//		underTest.letOut(10);
//		int bathroom = underTest.getBathroom();
//		assertEquals(0, bathroom);
//	}
//
//	@Test
//	public void shouldDecreaseEnergyBy10() {
//		OrganicPet underTest = new OrganicPet("name", "description", 0, 0, 0, 10);
//		underTest.play(10);
//		int energy = underTest.getEnergy();
//		assertEquals(0, energy);
//	}

	@Test
	public void shouldDetermineStatusAmazing() {
		OrganicPet underTest = new Dog ("name", "description", 0, 0, 0, 0, 0, 0);
		underTest.health();
		String status = underTest.health();
		assertEquals("Amazing", status);
	}

	@Test
	public void shouldDetermineStatusGreat() {
		OrganicPet underTest = new Dog ("name", "description", 10, 10, 10, 10, 0, 0);
		underTest.health();
		String status = underTest.health();
		assertEquals("Great", status);
	}

	@Test
	public void shouldDetermineStatusGood() {
		OrganicPet underTest = new Cat ("name", "description", 20, 20, 20, 20, 0);
		underTest.health();
		String status = underTest.health();
		assertEquals("Good", status);
	}

	@Test
	public void shouldDetermineStatusContent() {
		OrganicPet underTest = new Cat ("name", "description", 30, 30, 30, 30, 0);
		underTest.health();
		String status = underTest.health();
		assertEquals("Content", status);
	}

	@Test
	public void shouldDetermineStatusOkay() {
		OrganicPet underTest = new Dog("name", "description", 40, 40, 40, 40, 0, 0);
		underTest.health();
		String status = underTest.health();
		assertEquals("Okay", status);

	}

	@Test
	public void shouldDetermineStatusBad() {
		OrganicPet underTest = new  Cat("name", "description", 45, 45, 45, 45, 0);
		underTest.health();
		String status = underTest.health();
		assertEquals("Bad", status);
	}

	@Test
	public void shouldDetermineStatus() {
		OrganicPet underTest = new Dog("name", "description", 50, 50, 50, 50, 0, 0);
		underTest.health();
		String status = underTest.health();
		assertEquals("dead", status);
	}

	@Test
	public void shouldTick() {
		OrganicPet underTest = new Dog("name", "description", 10, 10, 10, 10, 0, 0);
		underTest.tick();
		underTest.getHunger();
		int hunger = underTest.getHunger();
		assertEquals(15, hunger);
		underTest.getThirst();
		int thirst = underTest.getThirst();
		assertEquals(15, thirst);
		underTest.getBathroom();
		int bathroom = underTest.getBathroom();
		assertEquals(15, bathroom);
		underTest.getEnergy();
		int energy = underTest.getEnergy();
		assertEquals(15, energy);
	}
}
