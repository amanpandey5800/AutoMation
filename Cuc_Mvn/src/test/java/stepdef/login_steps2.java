package stepdef;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login_steps2 extends utilities.common_methods {
	
	
	@Given("The login page is displayed")
	public void login_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		launch_chrome("https://www.saucedemo.com/");
		System.out.println("The login page is displayed ");
	}
	
	@When("^User enters \"(.*)\" and \"(.*)\"$")
	public void userentersname(String string,String string2) {
		
		dr.findElement(By.xpath("//input[@id='user-name']")).sendKeys(string);
		dr.findElement(By.xpath("//input[@id='password']")).sendKeys(string2);
		
	}
	
	@When("User clicks on login button")
	public void btn() {
		dr.findElement(By.id("login-button")).click();
		System.out.println("Clicked the button successfully");
	}
	
	@Then("^The application should display the message \"(.*)\"$")
	public void message(String emsg) {
		String a =dr.findElement(By.xpath("//span[@class='title']")).getText();
		Assert.assertEquals(emsg, a);
}
}
