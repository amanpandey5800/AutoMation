package Test_NG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class compatibility {

	private String browser;
	WebDriver dr;
	public compatibility(String browser) {
		this.browser=browser;		
	}
	
	@Test
	public void testall() {
		switch(browser) {
			case "Chrome":
			dr=new ChromeDriver();
			break;
			
			case "Edge":
			dr=new EdgeDriver();
			break;
			
			case "Firefox":
			dr=new FirefoxDriver();
			break;
		}
	}
	
	@Factory
	public static Object[] factoryMethod() {
		Object[] br= {
			new compatibility("Chrome"),
			new compatibility("Edge"),
			new compatibility("Firefox"),
		};
	return br;
	}
	
	@AfterMethod
	public void login() {
		dr.get("https://www.saucedemo.com");
		dr.manage().window().maximize();
		dr.findElement(By.id("user-name")).sendKeys("standard_user");
		dr.findElement(By.name("password")).sendKeys("secret_sauce");
		dr.findElement(By.id("login-button")).click();
	}
	

}
