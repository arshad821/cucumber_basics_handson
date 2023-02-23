package Hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class ThanosHooks {

	@Before(order=1)
	public void beforescenario() {
		System.out.println("Thanos collect all stones");
	}
	@After(order=1)
	public void afterscenario() {
		System.out.println("After killing thanos taking rest un garden");
	}
	@Before(order=0)
	public void beforetobfrscenario() {
		System.out.println("Thanos has to be born");
	}
	@After(order=0)
	public void aftertoaftrscenario() {
		System.out.println("Finally thanos dying");
	}
	
}
