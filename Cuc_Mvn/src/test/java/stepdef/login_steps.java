package stepdef;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.common_methods;

public class login_steps extends common_methods{

	@Given("Login page is displayed")
	public void login_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		launch_chrome("https://www.saucedemo.com/");
		System.out.println("The login page is displayed ");
	}
	
	@When("Enter the userid and password")
	public void inputs() {

		dr.findElement(By.id("user-name")).sendKeys("standard_user");
		dr.findElement(By.name("password")).sendKeys("secret_sauce");
		System.out.println("Entered the credentials successfully ");
	}
	
	@When("Click the login button")
	public void btn() {
		dr.findElement(By.id("login-button")).click();
		System.out.println("Clicked the button successfully");
	}
	
	@Then("Products page is displayed")
	public void prod() {
		String a =dr.findElement(By.xpath("//span[@class='title']")).getText();
		if(a.contains("Products")) {
			System.out.println("Login is successfull");
		}else {
			System.out.println("Login is Fail");
			
		}
	}
}
