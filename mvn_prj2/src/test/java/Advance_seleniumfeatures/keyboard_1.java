package Advance_seleniumfeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboard_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.saucedemo.com/");
		
		
		WebElement we1=dr.findElement(By.xpath("//*[@id=\"user-name\"]"));
		
		dr.manage().window().maximize();
		Actions act = new Actions(dr);
		
		act
		.sendKeys(we1,"hemmo!")
		.keyDown(Keys.CONTROL)
		.sendKeys("acvvv")
		.keyUp(Keys.CONTROL)
		.perform();
	}

}
	