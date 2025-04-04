package Test_NG;

import org.testng.annotations.Test;

public class new_group {
	
	@Test(groups= {"F1","F2"})
	public void sanityTest1() {
		System.out.println("Executing F1&F2 testcases");
		
	}
	
	@Test(groups= {"F1"})
	public void regressionTest1() {
		System.out.println("Executing F1 testcases");
		
	}
	
	@Test(groups= {"F2"})
	public void sanityTest2() {
		System.out.println("Executing F2 testcases");
	}
	
	@Test(groups = {"F1"})
	public void regressionTest2() {
		System.out.println("Executing F1 testcase");
	}
}
	
	
	
	  

