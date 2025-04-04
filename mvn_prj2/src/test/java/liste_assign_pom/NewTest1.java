package liste_assign_pom;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pom_pages.products_page;

@Listeners(Listener2.class)
public class NewTest1 extends common_methods {
	login_pagee lp;
	products_page pp;
	
	
	@BeforeMethod
	public void bm() {
		launchchrome("https://www.saucedemo.com");
		lp=new login_pagee(dr);
		pp=new products_page(dr);
	}
	


	@AfterMethod
	public void am() {
		dr.close();
	}	

	
	
	@Test
	public void test1() {
		lp.enter_username("standard_user");
		lp.enter_pwd("secret_sauce");
		lp.click_login();
		
		String atitile = pp.get_title();
		Assert.assertEquals("Products",atitile);
	}
	

	
	@Test
	public void test2() throws InterruptedException {
		lp.enter_username("standarddd_user");
		lp.enter_pwd("secret_sauces");
		lp.click_login();
		Thread.sleep(2000);
		String atitile = pp.get_title();
		Assert.assertEquals("Products",atitile);
	}
}