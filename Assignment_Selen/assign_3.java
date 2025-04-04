package Assignment_Selen;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class assign_3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver dr=new ChromeDriver();
		
		dr.get("https://the-internet.herokuapp.com/dynamic_controls");	
		
		dr.findElement(By.xpath("//form[@id='input-example']//button[@autocomplete='off']")).click();
		
		WebDriverWait wt=new WebDriverWait(dr,Duration.ofMillis(6000));
		wt.until(ExpectedConditions.textToBe(By.xpath("//p[@id='message']"), "It's enabled!"));
		
		dr.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello World");
		Thread.sleep(2000);
		
//		dr.close();
	}

}
