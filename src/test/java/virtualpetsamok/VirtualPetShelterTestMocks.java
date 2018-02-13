package virtualpetsamok;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class VirtualPetShelterTestMocks {

	@InjectMocks
	private VirtualPetShelter underTest;

	@Mock
	private OrganicPet organicPet1;

	@Mock
	private OrganicPet organicPet2;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void shouldFeedAllPets() {
		when(organicPet1.getName()).thenReturn("fido");
		underTest.addPet(organicPet1);
		when(organicPet2.getName()).thenReturn("bobo");
		underTest.addPet(organicPet2);
		
		underTest.feedAllPets();
		
		verify((OrganicPet) organicPet2).feed();
		verify((OrganicPet) organicPet1).feed();
	}
}