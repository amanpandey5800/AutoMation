package Core_Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class auto_login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver d=new ChromeDriver();
		d.get("https://www.saucedemo.com");
		
		d.findElement(By.id("user-name")).sendKeys("standard_user");
		d.findElement(By.name("password")).sendKeys("secret_sauce");
		d.findElement(By.id("login-button")).click();
		//xpath=//tagname[@attribute='value']
		
		String s=d.findElement(By.xpath("//span[@class='title']")).getText();
		
		System.out.println("Text Read = "+s);
		
		if(s.equals("Products")) {
			System.out.println("The actual text is same as expected ");
		}
		else {
			System.out.println("The actual test is not same as expected");
		}
		
		//xpath = //tagname[@attribute='value']
		// xpath=//span[@class='title']
	}
	
	
}
// ap5800@mail.com