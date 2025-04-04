package Core_Selenium;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.edge.EdgeBrowser;
import org.openqa.selenium.edge.EdgeDriver;

public class implicitwait1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver dr=new EdgeDriver();
		dr.get("https://www.saucedemo.com");
		dr.manage().window().maximize();
		
		dr.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		dr.findElement(By.id("user-name")).sendKeys("standard_user");
		
//		dr.close();
//		dr.quit();
	}
	

}
