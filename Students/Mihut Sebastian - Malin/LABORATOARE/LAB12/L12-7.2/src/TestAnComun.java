import static org.junit.Assert.*;

import org.junit.Test;

public class TestAnComun {

	@Test
	public void test() {
		AnBisect a= new AnBisect();
		assertFalse(a.esteAnBisect(203));
		assertFalse(!a.esteAnBisect(4));
		assertFalse(a.esteAnBisect(99));
		assertFalse(a.esteAnBisect(100));
		assertFalse(a.esteAnBisect(200));
		assertFalse(!a.esteAnBisect(400));
		assertFalse(a.esteAnBisect(500));
		assertFalse(a.esteAnBisect(1000));
		assertFalse(!a.esteAnBisect(1600));
		assertFalse(a.esteAnBisect(2018));
	}

}
