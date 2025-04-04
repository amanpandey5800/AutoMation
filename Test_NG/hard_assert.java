package Test_NG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class hard_assert {
	
	@Test
	public void test1() {
		Assert.assertEquals(true,true);
		System.out.println("In test1");
	}
	

	@Test
	public void test2() {
		Assert.assertEquals(false,true);
		System.out.println("In test2");
	}

	@Test
	public void test3() {
		Assert.assertEquals(false,false);
		System.out.println("In test3");
	}
	
}
