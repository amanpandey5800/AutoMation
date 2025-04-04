package Test_NG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class soft_assert {

	SoftAssert sa;
	@Test
	public void test1() {
		sa=new SoftAssert();
		
		sa.assertEquals(false, true);
		System.out.println("In test 1");
		sa.assertAll();
	}
	
	@Test
	public void test2() {
		sa.assertEquals(true, true);
		System.out.println("In test 2");
		sa.assertAll();
	}
	@Test
	public void test3() {
		sa.assertEquals(false, false);
		System.out.println("In test 3");
		sa.assertAll();
	}
	
}
