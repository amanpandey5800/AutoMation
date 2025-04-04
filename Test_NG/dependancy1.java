package Test_NG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependancy1 {
	
	@Test
	public void login() {
		System.out.println("In Login Method");
		Assert.assertEquals(true, false);
	}
	@Test(dependsOnMethods="login")
	public void verifyDashboard() {
		System.out.println("Dashboard Verification Passes");
	}

}
