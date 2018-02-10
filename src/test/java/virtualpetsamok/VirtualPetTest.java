package virtualpetsamok;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class VirtualPetTest {

	@Test
	public void shouldShowRoboticPet() {
		VirtualPet underTest = new RoboCat("name", "description", 0);
		String asString = underTest.toString();
		assertEquals("name: name| description: description| rust: 0| health: oil full", asString);
	}
	
	@Test
	public void shouldShowOrganicPet() {
		VirtualPet underTest = new Dog("name", "description", 0, 0, 0, 0, 0, 0);
		String asString = underTest.toString();
		assertEquals("name: name| description: description| hunger: 0| thirst: 0| bathroom: 0| energy:0| health: Amazing", asString);
	}
}

