package Assignment_Selen;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicit_wait_assignpract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr=new ChromeDriver();
		dr.get("https://the-internet.herokuapp.com/dynamic_controls");	
		dr.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		dr.findElement(By.xpath("//form[@id='checkbox-example']//button")).click();
		
		WebDriverWait wt=new WebDriverWait(dr,Duration.ofMillis(4000));
		WebElement we=wt.until(ExpectedConditions.elementToBeClickable(By.xpath("//form[@id='checkbox-example']//button")));
		we.click();
		
		WebDriverWait wt2=new WebDriverWait(dr,Duration.ofMillis(4000));
		WebElement we2=wt2.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='checkbox']")));
		we2.click();
		
		WebDriverWait wt3=new WebDriverWait(dr,Duration.ofMillis(4000));
		
		WebElement we3=wt3.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='checkbox']")));
		we3.click();
		
		dr.quit();
	}

}
