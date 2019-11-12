package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends ProjectSpecificMethods {
	@Before
	public void  preCondition() {
		openBrowser();
	}
	@After
	public void postCondition() {
		closeBrowser();

	}

}
