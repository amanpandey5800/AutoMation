package Core_Selenium;

import org.openqa.selenium.JavascriptExecutor;

public class jse_executor_scroll extends common_methods{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launchchrome("https://demowebshop.tricentis.com/");
		
		JavascriptExecutor jse=(JavascriptExecutor) dr;
		jse.executeScript("window.scrollBy(0,600)"); /// scrolls page 
	}

}
