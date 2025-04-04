package Mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//import org.openqa.selenium.By;

public class assign_9_keyb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.saucedemo.com/");
		
		WebElement we1=dr.findElement(By.xpath("//input[@id='user-name']"));
		
		Actions ac=new Actions(dr);
		ac
			.sendKeys(we1,"standard_user")
			.keyDown(Keys.TAB)
			.sendKeys("secret_sauce")
			.keyDown(Keys.TAB)
			.keyDown(Keys.ENTER)
			.perform();
	}

}
