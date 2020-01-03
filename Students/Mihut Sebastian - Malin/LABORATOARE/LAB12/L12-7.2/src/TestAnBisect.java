import static org.junit.Assert.*;

import org.junit.Test;

public class TestAnBisect {

	@Test
	public void test() {
		AnBisect a= new AnBisect();
		assertTrue(!a.esteAnBisect(203));
		assertTrue(a.esteAnBisect(4));
		assertTrue(!a.esteAnBisect(99));
		assertTrue(!a.esteAnBisect(100));
		assertTrue(!a.esteAnBisect(200));
		assertTrue(a.esteAnBisect(400));
		assertTrue(!a.esteAnBisect(500));
		assertTrue(!a.esteAnBisect(1000));
		assertTrue(a.esteAnBisect(1600));
		assertTrue(!a.esteAnBisect(2018));
	}


}
