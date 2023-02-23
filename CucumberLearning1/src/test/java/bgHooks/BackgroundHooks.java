package bgHooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class BackgroundHooks {
	
	@Before
	public void beforescenario() {
		System.out.println("This will run before all scenarios");
	}
	@After
	public void afterscenario() {
		System.out.println("This will run after all scenarios");
	}

}
