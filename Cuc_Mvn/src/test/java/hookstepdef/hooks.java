package hookstepdef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.common_methods;

public class hooks extends common_methods{
	
	
	
	@Before
	public void setup() {
	System.out.println("before hook");
	launch_chrome("https://demowebshop.tricentis.com/");
	
	}
	
	
	@After
	public void end() {
		System.out.println("After hook");
		dr.close();
	}
}
