package stepdef_assignment;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks extends utilities.common_methods{
	
//;
	logintestassign n;
	

	@Before
	public void setup() {
	System.out.println("before hook");
	launch_chrome("https://demowebshop.tricentis.com/");
	
	}
	
	
//	@Test
//	public void testt() {
//		n=new logintestassign();
//		String b=n.a;
//		String c=dr.findElement(By.xpath("//td [@class='product']//a[@href='/computing-and-internet']")).getText();
//		Assert.assertEquals(b,c);
//		System.out.println("Same product");
//	}
	
	@After
	public void end() {
		System.out.println("After hook");
//		dr.close();
	}

}
