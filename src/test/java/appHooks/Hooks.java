package appHooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	@Before(order = 1)
	public void setupBrowser() {
		System.out.println("Setting up the browser");
	}
	
	@Before(order = 2)
	public void setupDBConnection() {
		System.out.println("Setting up the BD connection");
	}
	
	
	@After(order = 2)
	public void tearDownDB() {
		System.out.println("Closing the DB connection");
	}
	
	@After(order = 1)
	public void tearDownBrowser() {
		System.out.println("Closing the browser");
	}

}
