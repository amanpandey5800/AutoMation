package Test_NG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {
	
	@BeforeClass
	public void bc() {
		System.out.println("In BeforeClass");
		
	}
	
	@AfterClass
	public void ac() {
		System.out.println("In AfterClass");
		
	}
	@BeforeMethod
	public void bm() {
		System.out.println("In before method");
	}
	
	@AfterMethod
	public void am() {
		System.out.println("In AfterMethod");
	}
	
	
  @Test
  public void test1() {
	  System.out.println("Test number 1");
  }
  
  @Test
  public void test2() {
	  System.out.println("Test Number 2");
  }
}
