package Advance_seleniumfeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Relative_locator_1 extends Utilities.common_methods{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launchchrome("https://www.saucedemo.com/");
		
		By email=RelativeLocator.with(By.tagName("input")).above(By.id("password"));
		dr.findElement(email).sendKeys("standard-user");
	
		By pass=RelativeLocator.with(By.tagName("input")).below(By.id("user-name"));
		dr.findElement(pass).sendKeys("secret-sauce");
		
		
	}

	
	
}
