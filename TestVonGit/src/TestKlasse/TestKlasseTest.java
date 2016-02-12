package TestKlasse;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestKlasseTest {

	TestKlasse einTest;
	@Before
	public void erzeugungen() {
		
	}
	@Test
	public void test() {
		einTest = new TestKlasse();
	einTest.gebeAus();
	}

}
