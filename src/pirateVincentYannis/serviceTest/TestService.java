package pirateVincentYannis.serviceTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import pirateVincentYannis.business.Pirate;
import pirateVincentYannis.service.PirateService;
import pirateVincentYannis.service.impl.PirateServiceImpl;

public class TestService {

	PirateService ps;

	@Before
	public void runBeforeTest() {
		ps = new PirateServiceImpl();
	}

	@Test
	public void testPlunder() {
		long nbPo = ps.plunder();
		assertEquals(100L, nbPo);

	}
	
	@Test
	public void testChoosePirate(){
		Pirate p1 = PirateServiceImpl.listePirate.get(3);
		Pirate p2 = ps.choosePirate();
		assertTrue(p2.getName().equals(p1.getName()));
	}

}
