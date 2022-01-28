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
public class TestCase2 {
	Computer Dell = new Computer("windows", 8, 16, true);
	Computer RaspberryPie = new Computer("linux", 4, 4, false);

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void hyperthreadingTest1() {
		assertEquals(4,RaspberryPie.getLogicalProcessors());
	}
	@Test
	public void hyperthreadingTest2() {
		assertEquals(16,Dell.getLogicalProcessors());
	}

}
