package Core_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class javascrptexecutor extends common_methods {
		
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
			launchchrome("https://www.saucedemo.com");
			JavascriptExecutor jse=(JavascriptExecutor) dr;
			WebElement we=dr.findElement(By.xpath("//div[@class='header-links']/ul/li/a[@href='login']"));
			jse.executeScript("arguments[0].click();", we);
	}
}
