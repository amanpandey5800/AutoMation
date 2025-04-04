package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Utilities.base_class;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom_pages.login_page;

public class loginsteps extends base_class {
	login_page lp;
	
	@Given("Login page is displayed")
	public void login_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	   launchchrome("https://saucedemo.com/");
	}
	@When("Enter the userid and password")
	public void enter_the_userid_and_password() {
		lp=new login_page(dr);
		lp.enter_username("standard_user");
		lp.enter_pwd("secret_sauce");
		
	    
	}
	@When("Click the login button")
	public void click_the_login_button() {
		lp.click_login();
	}


	
	@When("Products page is displayed")
	public void products_page_is_displayed() {
		String a=dr.findElement(By.className("title")).getText();
		Assert.assertEquals(a, "Products");
		System.out.println("WELL DONEE");
	    
	}


}
