package TaggedHooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class TaggedHooksExample {
	
	@Before
	public void beforescenario() {
		System.out.println("This will run bfr evry scenario");
	}
	@After
	public void afterscenario() {
		System.out.println("This will run aftr evry scenari");
	}
	@Before("@First,@Second")
	public void beforefirstandsecond() {
		System.out.println("This will run  bfr a 1st and 2nd scenario");
	}
	@After("@First,@Second")
	public void afterfirst() {
		System.out.println("This will run only after 1st and 2nd  scenario");
	}
	//@Before("@Second")
	//public void beforesecond() {
		//System.out.println("This will run only bfr 2nd  scenario");
	//}
	//@After("@Second")
	//public void aftersecond() {
	//	System.out.println("This will run only aftr 2nd scenario");
	//}
	@Before("@Third")
	public void beforethird() {
		System.out.println("This will run only bfr thrd  scenario");
	}
	@After("@Third")
	public void afterthird() {
		System.out.println("This will run only aftr 3rd scenario");
	}
	
}
