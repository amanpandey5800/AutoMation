package hookstepdef;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login_testhk extends utilities.common_methods{
	
	
	@When("^click the login$")
	public void click_the_login() {
	    
		dr.findElement(By.xpath("//div[@class='header-links']//a[@href='/login']")).click();
		dr.manage().window().maximize();
	}
	
	
	@When("enter the id")
	public void userid() {
		dr.findElement(By.id("Email")).sendKeys("ap5800@mail.com");
	}
	
	@When("enter the password")
	public void passw() {
		dr.findElement(By.xpath("//input[@id='Password']")).sendKeys("abcdef");
	}
	
	
	@When ("click the log in")
	public void logg() {
		dr.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	}
		
	@Then("login successful")
	public void then() {
		System.out.println("Login success");
	}
}
