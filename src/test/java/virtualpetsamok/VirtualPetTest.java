package virtualpetsamok;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class VirtualPetTest {

	@Test
	public void shouldShowRoboticPet() {
		VirtualPet underTest = new RoboCat("name", "description", 0, 0);
		String asString = underTest.toString();
		assertEquals("name	| description	| Happy 	 | Health: oil full 			|| Rust: 0| Battery: 0", asString);
	}
}

