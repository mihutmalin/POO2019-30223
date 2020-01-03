import org.junit.runner.RunWith;
import org.junit.runners.Suite; 

public class TestToghether {

	@RunWith(Suite.class)
	@Suite.SuiteClasses({
	 TestAnBisect.class,
	 TestAnComun.class
	}) 

	public class TestSuite {}

}
