package tests;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Computer;

/**  
* Kai Mwirotsi-Shaw - kimwirotsishaw  
* CIS171 12601 WH1  
* Jan 27, 2022  
*/
public class TestCase1 {
	Computer Dell = new Computer("windows", 8, 16, true);
	Computer RaspberryPie = new Computer("linux", 4, 4, true);

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void windowsCompatibilityTest() {
		assertTrue(Dell.isWindowsCompatible());
	}
	@Test
	public void linuxCompatibilityTest() {
		assertFalse(RaspberryPie.isWindowsCompatible());
	}
}
