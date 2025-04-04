package Tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Utilities.common_methods;
import pom_pages.login_page;
import pom_pages.products_page;

public class NewTest1 extends common_methods {
	login_page lp;
	products_page pp;
	
	@BeforeMethod
	public void bm() {
		launchchrome("https://www.saucedemo.com");
		lp=new login_page(dr);
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
	public void test2() {
		lp.enter_username("standard_user");
		lp.enter_pwd("secret_sauce");
		lp.click_login();
		String atitile = pp.get_title();
		Assert.assertEquals("products",atitile);
	}
}
